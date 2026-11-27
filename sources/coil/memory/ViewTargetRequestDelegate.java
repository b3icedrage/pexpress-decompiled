package coil.memory;

import androidx.lifecycle.g;
import defpackage.AbstractC5949pX1;
import defpackage.C4316i;
import defpackage.C4750jo1;
import defpackage.C7716xw0;
import defpackage.EP0;
import defpackage.InterfaceC5739oX1;
import defpackage.XF0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 4, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {
    public final C4750jo1 d;
    public final C7716xw0 e;
    public final AbstractC5949pX1 g;
    public final XF0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestDelegate(@NotNull C4750jo1 imageLoader, @NotNull C7716xw0 request, @NotNull AbstractC5949pX1 targetDelegate, @NotNull XF0 job) {
        super(0);
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(targetDelegate, "targetDelegate");
        Intrinsics.checkNotNullParameter(job, "job");
        this.d = imageLoader;
        this.e = request;
        this.g = targetDelegate;
        this.h = job;
    }

    @Override // coil.memory.RequestDelegate
    public final void c() {
        this.h.l(null);
        AbstractC5949pX1 abstractC5949pX1 = this.g;
        abstractC5949pX1.a();
        C4316i.d(abstractC5949pX1);
        C7716xw0 c7716xw0 = this.e;
        InterfaceC5739oX1 interfaceC5739oX1 = c7716xw0.c;
        boolean z = interfaceC5739oX1 instanceof EP0;
        g gVar = c7716xw0.h;
        if (z) {
            gVar.c((EP0) interfaceC5739oX1);
        }
        gVar.c(this);
    }
}
