package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3102cB0 extends v<C3731fB0, C5252mB0> {

    @NotNull
    public static final a f = new a();

    @NotNull
    public final AbstractC5603ns e;

    /* JADX INFO: renamed from: cB0$a */
    public static final class a extends p.e<C3731fB0> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C3731fB0 c3731fB0, C3731fB0 c3731fB1) {
            C3731fB0 oldItem = c3731fB0;
            C3731fB0 newItem = c3731fB1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C3731fB0 c3731fB0, C3731fB0 c3731fB1) {
            C3731fB0 oldItem = c3731fB0;
            C3731fB0 newItem = c3731fB1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.a == newItem.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3102cB0(@NotNull AbstractC5603ns bindingFactory) {
        super(f);
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        this.e = bindingFactory;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        String string;
        C5252mB0 holder = (C5252mB0) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C3731fB0 c3731fB0O = o(i);
        Intrinsics.checkNotNullExpressionValue(c3731fB0O, "getItem(...)");
        C3731fB0 instructionItem = c3731fB0O;
        Intrinsics.checkNotNullParameter(instructionItem, "instructionItem");
        InterfaceC4151hB0 interfaceC4151hB0 = holder.u;
        interfaceC4151hB0.getTitle().setText(interfaceC4151hB0.getTitle().getContext().getString(instructionItem.a));
        int i2 = instructionItem.b;
        List<String> list = instructionItem.c;
        if (list == null) {
            string = interfaceC4151hB0.getTitle().getContext().getString(i2);
        } else {
            Context context = interfaceC4151hB0.getTitle().getContext();
            String[] strArr = (String[]) list.toArray(new String[0]);
            string = context.getString(i2, Arrays.copyOf(strArr, strArr.length));
        }
        Intrinsics.checkNotNull(string);
        interfaceC4151hB0.getDescription().setText(string);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC4151hB0.class);
        AbstractC5603ns abstractC5603ns = this.e;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC4151hB0 interfaceC4151hB0 = (InterfaceC4151hB0) abstractC5603ns.a(bindingProvider);
        C6621sj.g(interfaceC4151hB0, parent);
        return new C5252mB0(interfaceC4151hB0);
    }
}
