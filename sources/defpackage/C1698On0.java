package defpackage;

import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: On0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1698On0 extends AbstractC1776Pn0<Object> {
    public final /* synthetic */ AbstractC1776Pn0.a<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698On0(AbstractC1776Pn0.a<Object> aVar, InterfaceC5889pD1 interfaceC5889pD1) {
        super(interfaceC5889pD1);
        this.b = aVar;
    }

    @Override // defpackage.AbstractC1776Pn0
    @NotNull
    public final LiveData<C4705jd<Void>> a() {
        C5531nY0 c5531nY0 = this.b.b;
        if (c5531nY0 != null) {
            return c5531nY0.invoke();
        }
        throw new IllegalArgumentException("You need to declare apiCall method");
    }

    @Override // defpackage.AbstractC1776Pn0
    @NotNull
    public final Object b(@NotNull Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        C5741oY0 c5741oY0 = this.b.c;
        if (c5741oY0 != null) {
            return c5741oY0.invoke(headers);
        }
        throw new IllegalArgumentException("You need to declare handleResponse method");
    }
}
