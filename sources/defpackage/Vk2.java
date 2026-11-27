package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Vk2 {
    public final OV a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public interface a {
        void a(@NonNull C3429dk2 c3429dk2);
    }

    public static class b implements Runnable {
        public final Vk2 d;
        public final C3429dk2 e;

        public b(@NonNull Vk2 vk2, @NonNull C3429dk2 c3429dk2) {
            this.d = vk2;
            this.e = c3429dk2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.d.d) {
                try {
                    if (((b) this.d.b.remove(this.e)) != null) {
                        a aVar = (a) this.d.c.remove(this.e);
                        if (aVar != null) {
                            aVar.a(this.e);
                        }
                    } else {
                        AS0 as0C = AS0.c();
                        this.e.toString();
                        as0C.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        AS0.d("WorkTimer");
    }

    public Vk2(@NonNull OV ov) {
        this.a = ov;
    }

    public final void a(@NonNull C3429dk2 c3429dk2) {
        synchronized (this.d) {
            try {
                if (((b) this.b.remove(c3429dk2)) != null) {
                    AS0 as0C = AS0.c();
                    Objects.toString(c3429dk2);
                    as0C.getClass();
                    this.c.remove(c3429dk2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
