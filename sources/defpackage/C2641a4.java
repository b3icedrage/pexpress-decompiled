package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.api.core.backend.domain.models.responseModels.AccountType;
import com.pexpress.tool.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2641a4 extends v<C5648o5, C5438n5> {

    @NotNull
    public static final a h = new a();

    @NotNull
    public final AbstractC5603ns e;

    @NotNull
    public final InterfaceC4119h3 f;

    @NotNull
    public final C4123h4 g;

    /* JADX INFO: renamed from: a4$a */
    public static final class a extends p.e<C5648o5> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C5648o5 c5648o5, C5648o5 c5648o6) {
            C5648o5 oldItem = c5648o5;
            C5648o5 newItem = c5648o6;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C5648o5 c5648o5, C5648o5 c5648o6) {
            C5648o5 oldItem = c5648o5;
            C5648o5 newItem = c5648o6;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.a.getId() == newItem.a.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2641a4(@NotNull AbstractC5603ns bindingFactory, @NotNull InterfaceC4119h3 accountItemResourceProvider, @NotNull C4123h4 onItemClick) {
        super(h);
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(accountItemResourceProvider, "accountItemResourceProvider");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = bindingFactory;
        this.f = accountItemResourceProvider;
        this.g = onItemClick;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        C5438n5 holder = (C5438n5) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C5648o5 c5648o5O = o(i);
        Intrinsics.checkNotNullExpressionValue(c5648o5O, "getItem(...)");
        C5648o5 accountWrapper = c5648o5O;
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        holder.x = accountWrapper;
        AccountType type = accountWrapper.a.getType();
        AccountType accountType = AccountType.REAL;
        InterfaceC4119h3 interfaceC4119h3 = holder.v;
        InterfaceC3699f3 interfaceC3699f3 = holder.u;
        if (type == accountType) {
            ImageView icon = interfaceC3699f3.getIcon();
            interfaceC4119h3.getClass();
            C3435dm0.d(icon, R.drawable.ic_robot_account_real);
            interfaceC3699f3.getTitle().setText(interfaceC4119h3.a());
            interfaceC3699f3.e().setText(C5438n5.q(accountWrapper, accountWrapper.c));
        } else {
            ImageView icon2 = interfaceC3699f3.getIcon();
            interfaceC4119h3.getClass();
            C3435dm0.d(icon2, R.drawable.ic_robot_account_demo);
            interfaceC3699f3.getTitle().setText(interfaceC4119h3.b());
            interfaceC3699f3.e().setText(C5438n5.q(accountWrapper, "DEMO"));
        }
        View viewB = interfaceC3699f3.b();
        boolean z = accountWrapper.b;
        viewB.setEnabled(!z);
        Iterator it = WE.f(interfaceC3699f3.getTitle(), interfaceC3699f3.e(), interfaceC3699f3.j()).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setTypeface(null, z ? 1 : 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC3699f3.class);
        AbstractC5603ns abstractC5603ns = this.e;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC3699f3 interfaceC3699f3 = (InterfaceC3699f3) abstractC5603ns.a(bindingProvider);
        C6621sj.g(interfaceC3699f3, parent);
        return new C5438n5(interfaceC3699f3, this.f, this.g);
    }
}
