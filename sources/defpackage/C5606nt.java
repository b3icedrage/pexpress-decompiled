package defpackage;

import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: renamed from: nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5606nt extends VC1 {
    public String d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("BodyEvent(");
        String strTrim = this.d;
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        sb.append(strTrim);
        sb.append(")");
        LocatorImpl locatorImpl = this.c;
        sb.append(locatorImpl.getLineNumber());
        sb.append(",");
        sb.append(locatorImpl.getColumnNumber());
        return sb.toString();
    }
}
