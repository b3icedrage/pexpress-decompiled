package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6803tc {
    public static final ThreadLocal<C6803tc> f = new ThreadLocal<>();
    public d d;
    public final C2703aM1<b, Long> a = new C2703aM1<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final a c = new a();
    public boolean e = false;

    /* JADX INFO: renamed from: tc$a */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: tc$b */
    public interface b {
        boolean a(long j);
    }

    /* JADX INFO: renamed from: tc$c */
    public static abstract class c {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }
    }

    /* JADX INFO: renamed from: tc$d */
    public static class d extends c {
        public final Choreographer b;
        public final a c;

        /* JADX INFO: renamed from: tc$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ArrayList<b> arrayList;
                a aVar = d.this.a;
                aVar.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                C6803tc c6803tc = C6803tc.this;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    arrayList = c6803tc.b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i);
                    if (bVar != null) {
                        C2703aM1<b, Long> c2703aM1 = c6803tc.a;
                        Long orDefault = c2703aM1.getOrDefault(bVar, null);
                        if (orDefault == null) {
                            bVar.a(jUptimeMillis);
                        } else if (orDefault.longValue() < jUptimeMillis2) {
                            c2703aM1.remove(bVar);
                            bVar.a(jUptimeMillis);
                        }
                    }
                    i++;
                }
                if (c6803tc.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    c6803tc.e = false;
                }
                if (arrayList.size() > 0) {
                    if (c6803tc.d == null) {
                        c6803tc.d = new d(c6803tc.c);
                    }
                    d dVar = c6803tc.d;
                    dVar.b.postFrameCallback(dVar.c);
                }
            }
        }

        public d(a aVar) {
            super(aVar);
            this.b = Choreographer.getInstance();
            this.c = new a();
        }
    }
}
