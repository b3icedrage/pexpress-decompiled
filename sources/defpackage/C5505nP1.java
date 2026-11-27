package defpackage;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: renamed from: nP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5505nP1 extends VC1 {
    public final AttributesImpl d;

    public C5505nP1(String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.d = new AttributesImpl(attributes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartEvent(");
        sb.append(this.b);
        AttributesImpl attributesImpl = this.d;
        if (attributesImpl != null) {
            for (int i = 0; i < attributesImpl.getLength(); i++) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(attributesImpl.getLocalName(i));
                sb.append("=\"");
                sb.append(attributesImpl.getValue(i));
                sb.append("\"");
            }
        }
        sb.append(")  [");
        LocatorImpl locatorImpl = this.c;
        sb.append(locatorImpl.getLineNumber());
        sb.append(",");
        sb.append(locatorImpl.getColumnNumber());
        sb.append("]");
        return sb.toString();
    }
}
