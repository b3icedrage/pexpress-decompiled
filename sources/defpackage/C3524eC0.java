package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: renamed from: eC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3524eC0 {
    public static final Vector j = new Vector(0);
    public final C5286mM1 a;
    public final C3315dC0 b;
    public final C2114Tw d;
    public final C5229m50 e;
    public LocatorImpl f;
    public C5229m50 i = null;
    public final ArrayList<AbstractC1333Jw0> c = new ArrayList<>(3);
    public final Stack<List<AbstractC5858p5>> h = new Stack<>();
    public final C7247vi g = new C7247vi(this);

    public C3524eC0(HS0 hs0, C5286mM1 c5286mM1, C5229m50 c5229m50) {
        this.d = new C2114Tw(hs0, this);
        this.a = c5286mM1;
        this.b = new C3315dC0(hs0, this);
        this.e = c5229m50;
    }
}
