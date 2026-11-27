package defpackage;

import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: renamed from: p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5858p5 extends C5494nM {
    public static String t(C3315dC0 c3315dC0) {
        StringBuilder sb = new StringBuilder("line: ");
        sb.append(u(c3315dC0));
        sb.append(", column: ");
        LocatorImpl locatorImpl = c3315dC0.k.f;
        sb.append(locatorImpl != null ? locatorImpl.getColumnNumber() : -1);
        return sb.toString();
    }

    public static int u(C3315dC0 c3315dC0) {
        LocatorImpl locatorImpl = c3315dC0.k.f;
        if (locatorImpl != null) {
            return locatorImpl.getLineNumber();
        }
        return -1;
    }

    public abstract void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl);

    public abstract void s(C3315dC0 c3315dC0, String str);

    public final String toString() {
        return getClass().getName();
    }

    public void r(C3315dC0 c3315dC0, String str) {
    }
}
