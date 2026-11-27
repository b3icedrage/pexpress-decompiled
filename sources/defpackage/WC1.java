package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes.dex */
public final class WC1 extends DefaultHandler implements InterfaceC5284mM {
    public final C5914pM d;
    public Locator g;
    public final ArrayList e = new ArrayList();
    public final C5229m50 h = new C5229m50();

    public WC1(HS0 hs0) {
        this.d = new C5914pM(hs0, this);
    }

    public final void a(String str) {
        this.d.a(str);
    }

    public final void c(String str, Throwable th) {
        this.d.c(str, th);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        String str = new String(cArr, i, i2);
        ArrayList arrayList = this.e;
        VC1 vc1 = arrayList.isEmpty() ? null : (VC1) C1742Pc.c(1, arrayList);
        if (vc1 instanceof C5606nt) {
            C5606nt c5606nt = (C5606nt) vc1;
            c5606nt.d = C5807oq.b(new StringBuilder(), c5606nt.d, str);
        } else {
            if (str.trim().length() == 0) {
                return;
            }
            C5606nt c5606nt2 = new C5606nt(null, null, null, this.g);
            c5606nt2.d = str;
            arrayList.add(c5606nt2);
        }
    }

    public final void d(InputSource inputSource) {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setValidating(false);
            sAXParserFactoryNewInstance.setNamespaceAware(true);
            try {
                sAXParserFactoryNewInstance.newSAXParser().parse(inputSource, this);
            } catch (IOException e) {
                c("I/O error occurred while parsing xml file", e);
                throw new C5054lG0("I/O error occurred while parsing xml file", e);
            } catch (SAXException e2) {
                throw new C5054lG0("Problem parsing XML document. See previously reported errors.", e2);
            } catch (Exception e3) {
                c("Unexpected exception while parsing XML document.", e3);
                throw new C5054lG0("Unexpected exception while parsing XML document.", e3);
            }
        } catch (Exception e4) {
            c("Parser configuration error occurred", e4);
            throw new C5054lG0("Parser configuration error occurred", e4);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.e.add(new J60(str, str2, str3, this.g));
        ArrayList<String> arrayList = this.h.a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void error(SAXParseException sAXParseException) {
        a("XML_PARSING - Parsing error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber());
        a(sAXParseException.toString());
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void fatalError(SAXParseException sAXParseException) {
        a("XML_PARSING - Parsing fatal error on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber());
        a(sAXParseException.toString());
    }

    @Override // defpackage.InterfaceC5284mM
    public final void j(HS0 hs0) {
        this.d.j(hs0);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.g = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4 = (str2 == null || str2.length() < 1) ? str3 : str2;
        C5229m50 c5229m50 = this.h;
        c5229m50.a.add(str4);
        new C5229m50().a.addAll(c5229m50.a);
        this.e.add(new C5505nP1(str, str2, str3, attributes, this.g));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public final void warning(SAXParseException sAXParseException) {
        String str = "XML_PARSING - Parsing warning on line " + sAXParseException.getLineNumber() + " and column " + sAXParseException.getColumnNumber();
        C5914pM c5914pM = this.d;
        c5914pM.getClass();
        c5914pM.d(new Ff2(str, sAXParseException, 1, c5914pM.h()));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }
}
