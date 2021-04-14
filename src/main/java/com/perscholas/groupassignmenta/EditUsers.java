package com.perscholas.groupassignmenta;

import java.io.IOException;
import java.util.ArrayList;

public interface EditUsers<T> {
    void manipulate(ArrayList<UserContacts> u, String v) throws IOException;
}
