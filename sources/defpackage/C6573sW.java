package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: sW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6573sW implements Ta2 {
    public final String a;
    public final C5375mm0 b;

    public C6573sW(Set<AbstractC6553sP0> set, C5375mm0 c5375mm0) {
        this.a = b(set);
        this.b = c5375mm0;
    }

    public static String b(Set<AbstractC6553sP0> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC6553sP0> it = set.iterator();
        while (it.hasNext()) {
            AbstractC6553sP0 next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.Ta2
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        C5375mm0 c5375mm0 = this.b;
        synchronized (c5375mm0.a) {
            setUnmodifiableSet = Collections.unmodifiableSet(c5375mm0.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (c5375mm0.a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(c5375mm0.a);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
