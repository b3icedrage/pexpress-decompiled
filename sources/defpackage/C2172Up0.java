package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Up0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {ModuleDescriptor.MODULE_VERSION, 89}, m = "bodyNullable")
public final class C2172Up0 extends LM {
    public C2250Vp0 d;
    public A62 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2250Vp0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172Up0(C2250Vp0 c2250Vp0, LM lm) {
        super(lm);
        this.h = c2250Vp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
