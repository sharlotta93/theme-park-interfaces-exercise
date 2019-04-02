package Attractions;

import Visitor.*;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}
