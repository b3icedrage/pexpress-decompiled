package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7514wz extends AbstractC7934yz {

    @NotNull
    public final AbstractC5603ns h;

    @NotNull
    public final C3554eM0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7514wz(@NotNull AbstractC5603ns languageFactory, @NotNull C3554eM0 resourcesProvider, @NotNull InterfaceC2130Ub0 callback, @NotNull C6682t10 diffUtilLang, @NotNull C0639Az onItemClickListener) {
        super(callback, diffUtilLang, onItemClickListener);
        Intrinsics.checkNotNullParameter(languageFactory, "languageFactory");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffUtilLang, "diffUtilLang");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.h = languageFactory;
        this.i = resourcesProvider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC3135cM0.class);
        AbstractC5603ns abstractC5603ns = this.h;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC3135cM0 interfaceC3135cM0 = (InterfaceC3135cM0) abstractC5603ns.a(bindingProvider);
        C6621sj.g(interfaceC3135cM0, parent);
        return new C3974gM0(interfaceC3135cM0, this.i);
    }
}
