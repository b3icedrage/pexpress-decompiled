package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class KF1<T> implements InterfaceC6606sf0<T> {

    @NotNull
    public final InterfaceC7364wF1<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public KF1(@NotNull InterfaceC7364wF1<? super T> interfaceC7364wF1) {
        this.d = interfaceC7364wF1;
    }

    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
        Object objJ = this.d.j(jm, t);
        return objJ == MN.d ? objJ : Unit.a;
    }
}
