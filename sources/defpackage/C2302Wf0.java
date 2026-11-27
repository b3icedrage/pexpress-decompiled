package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2302Wf0 implements InterfaceC6606sf0<Object> {
    public final /* synthetic */ C3027bp1 d;

    public C2302Wf0(C3027bp1 c3027bp1) {
        this.d = c3027bp1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM<? super Unit> jm) {
        this.d.d = obj;
        throw new C7306w(this);
    }
}
