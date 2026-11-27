package defpackage;

import androidx.annotation.NonNull;
import com.google.firebase.perf.metrics.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class J02 {
    public final Trace a;

    public J02(@NonNull Trace trace) {
        this.a = trace;
    }

    public final I02 a() {
        List listUnmodifiableList;
        I02.a aVarP = I02.P();
        aVarP.x(this.a.h);
        aVarP.v(this.a.o.d);
        Trace trace = this.a;
        aVarP.w(trace.o.b(trace.p));
        for (C2707aO c2707aO : this.a.i.values()) {
            aVarP.t(c2707aO.d, c2707aO.e.get());
        }
        ArrayList arrayList = this.a.l;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVarP.s(new J02((Trace) it.next()).a());
            }
        }
        Map<String, String> attributes = this.a.getAttributes();
        aVarP.p();
        I02.A((I02) aVarP.e).putAll(attributes);
        Trace trace2 = this.a;
        synchronized (trace2.k) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (C5760od1 c5760od1 : trace2.k) {
                    if (c5760od1 != null) {
                        arrayList2.add(c5760od1);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        C5970pd1[] c5970pd1ArrB = C5760od1.b(listUnmodifiableList);
        if (c5970pd1ArrB != null) {
            List listAsList = Arrays.asList(c5970pd1ArrB);
            aVarP.p();
            I02.C((I02) aVarP.e, listAsList);
        }
        return aVarP.n();
    }
}
