package defpackage;

import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: loaded from: classes.dex */
public final class J60 extends VC1 {
    public final String toString() {
        StringBuilder sb = new StringBuilder("  EndEvent(");
        sb.append(this.b);
        sb.append(")  [");
        LocatorImpl locatorImpl = this.c;
        sb.append(locatorImpl.getLineNumber());
        sb.append(",");
        sb.append(locatorImpl.getColumnNumber());
        sb.append("]");
        return sb.toString();
    }
}
