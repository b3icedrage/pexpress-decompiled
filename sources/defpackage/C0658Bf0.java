package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0658Bf0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ Object d;

    public C0658Bf0(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objA = interfaceC6606sf0.a(this.d, jm);
        return objA == MN.d ? objA : Unit.a;
    }
}
