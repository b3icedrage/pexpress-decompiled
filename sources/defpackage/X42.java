package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class X42 implements W42 {
    public final Set<H60> a;
    public final C1778Po b;
    public final C3081c52 c;

    public X42(Set set, C1778Po c1778Po, C3081c52 c3081c52) {
        this.a = set;
        this.b = c1778Po;
        this.c = c3081c52;
    }

    @Override // defpackage.W42
    public final Y42 a(String str, H60 h60, A42 a42) {
        Set<H60> set = this.a;
        if (set.contains(h60)) {
            return new Y42(this.b, str, h60, a42, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", h60, set));
    }
}
