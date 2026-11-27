package defpackage;

import org.xml.sax.Locator;
import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: loaded from: classes.dex */
public class VC1 {
    public final String a;
    public final String b;
    public final LocatorImpl c;

    public VC1(String str, String str2, String str3, Locator locator) {
        this.a = str2;
        this.b = str3;
        this.c = new LocatorImpl(locator);
    }
}
