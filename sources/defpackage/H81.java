package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class H81 implements Qf2 {
    public Object a;

    public H81(@Nullable List list) {
        this.a = new ArrayList(list == null ? new ArrayList(0) : list);
    }

    @Override // defpackage.Qf2
    public boolean a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Qf2 qf2 = (Qf2) this.a;
        if (qf2 != null) {
            return qf2.a(text);
        }
        return false;
    }

    @Override // defpackage.Qf2
    public boolean b(@NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Qf2 qf2 = (Qf2) this.a;
        if (qf2 != null) {
            return qf2.b(bytes);
        }
        return false;
    }

    @Override // defpackage.Qf2
    public boolean c(int i, @Nullable String str) {
        Qf2 qf2 = (Qf2) this.a;
        if (qf2 != null) {
            return qf2.c(i, str);
        }
        return false;
    }

    @Override // defpackage.Qf2
    public void cancel() {
        Qf2 qf2 = (Qf2) this.a;
        if (qf2 != null) {
            qf2.cancel();
        }
    }
}
