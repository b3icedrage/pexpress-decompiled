package defpackage;

import android.graphics.drawable.ColorDrawable;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: i60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4342i60 implements InterfaceC8038zU {

    @NotNull
    public static final C4342i60 c = new C4342i60();
    public static final C7197vU a = new C7197vU(new ColorDrawable(), false);
    public static final C1398Ks b = new C1398Ks();

    @Override // defpackage.InterfaceC8038zU
    @Nullable
    public final Object a(@NotNull C2509Yn1 c2509Yn1, @NotNull InterfaceC2833av interfaceC2833av, @NotNull LM1 lm1, @NotNull C4695ja1 c4695ja1, @NotNull S60 s60) throws IOException {
        try {
            new Long(interfaceC2833av.z0(b));
            interfaceC2833av.close();
            return a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(interfaceC2833av, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC8038zU
    public final boolean b(@NotNull InterfaceC2833av source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return false;
    }
}
