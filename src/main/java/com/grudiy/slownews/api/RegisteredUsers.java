package com.grudiy.slownews.api;

import com.grudiy.slownews.model.User;
import com.grudiy.slownews.model.UserStorage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;

/**
 * Created by Owner on 12.09.2016.
 * API endpoint, gives list of registered users in XML in the answer to GET request
 */
@WebServlet("/api/registeredusers")
public class RegisteredUsers extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            Marshaller myJaxbMarshaller = JAXBContext.newInstance(User.class).createMarshaller();
            myJaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            myJaxbMarshaller.marshal(UserStorage.getUsers(), response.getWriter()); //marshalling object to response
            response.setStatus(200);
            System.out.println("Serialized successfully");
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
