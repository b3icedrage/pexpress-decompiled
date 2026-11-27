package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Nd2 {
    public static final C6814te2 a(View view, Pair pair, List list, DS0 ds0) {
        boolean z;
        C6202qj c6202qj = new C6202qj();
        c6202qj.addLast(view);
        C6814te2 c6814te2 = null;
        while (!c6202qj.isEmpty()) {
            try {
                View view2 = (View) c6202qj.removeFirst();
                if (view2 instanceof ViewGroup) {
                    Id2 elements = new Id2((ViewGroup) view2);
                    Intrinsics.checkNotNullParameter(c6202qj, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Iterator<View> it = elements.iterator();
                    while (true) {
                        Jd2 jd2 = (Jd2) it;
                        if (!jd2.hasNext()) {
                            break;
                        }
                        c6202qj.addLast(jd2.next());
                    }
                }
                if (list == null || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C6814te2 c6814te2A = ((InterfaceC7445we2) it2.next()).a(view2, pair);
                        if (c6814te2A != null) {
                            z = true;
                        } else {
                            c6814te2A = c6814te2;
                            z = false;
                        }
                        if (z) {
                            c6814te2 = c6814te2A;
                            break;
                        }
                        c6814te2 = c6814te2A;
                    }
                }
            } catch (NoSuchElementException unused) {
                ds0.error("Unable to get view from queue");
            }
        }
        return c6814te2;
    }
}
