package defpackage;

import java.util.ArrayDeque;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4794k20 {
    public boolean b;
    public boolean c;
    public boolean a = true;

    @NotNull
    public final ArrayDeque d = new ArrayDeque();

    public final void a() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!(this.b || !this.a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }
}
