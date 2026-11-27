package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C2803b;
import androidx.recyclerview.widget.C2804c;
import androidx.recyclerview.widget.C2806e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.pexpress.tool.R;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7934yz extends v<UL0, C3974gM0> {

    @NotNull
    public final InterfaceC2130Ub0 e;

    @NotNull
    public final C0639Az f;

    @NotNull
    public final C2806e<UL0> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7934yz(@NotNull InterfaceC2130Ub0 callback, @NotNull C6682t10 diffUtilLang, @NotNull C0639Az onItemClickListener) {
        super(diffUtilLang);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffUtilLang, "diffUtilLang");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.e = callback;
        this.f = onItemClickListener;
        C2803b c2803b = new C2803b(this);
        synchronized (C2804c.a.a) {
            try {
                if (C2804c.a.b == null) {
                    C2804c.a.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = new C2806e<>(c2803b, new C2804c(C2804c.a.b, diffUtilLang));
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.g.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void f(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.v.add(new C2248Vo1(recyclerView.getContext(), new C7724xz(this)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        int i2;
        C3974gM0 holder = (C3974gM0) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        UL0 language = this.g.f.get(i);
        Intrinsics.checkNotNull(language);
        Intrinsics.checkNotNullParameter(language, "language");
        InterfaceC3135cM0 interfaceC3135cM0 = holder.u;
        C3435dm0.e(interfaceC3135cM0.C(), language.l, EnumC7035uh1.g);
        interfaceC3135cM0.y().setText(language.d);
        Intrinsics.checkNotNullParameter(language, "language");
        TextView textViewY = interfaceC3135cM0.y();
        boolean z = language.m;
        textViewY.setTypeface(null, z ? 1 : 0);
        ConstraintLayout constraintLayoutG = interfaceC3135cM0.G();
        Context context = constraintLayoutG.getContext();
        C3554eM0 c3554eM0 = holder.v;
        if (z) {
            c3554eM0.getClass();
            i2 = R.color.changeLanguageItemBackgroundSelected;
        } else {
            c3554eM0.getClass();
            i2 = R.color.changeLanguageItemBackgroundUnselected;
        }
        constraintLayoutG.setBackgroundColor(C6333rM.getColor(context, i2));
    }
}
