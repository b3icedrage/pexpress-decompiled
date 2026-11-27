package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0958Fb0<T> extends H7<T> {

    @NotNull
    public final KW1 u;

    /* JADX INFO: renamed from: Fb0$a */
    public static final class a extends ML0 implements Function0<TextView> {
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.d.findViewById(R.id.title);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0958Fb0(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.u = XO0.b(new a(itemView));
    }

    @Override // defpackage.H7
    @SuppressLint({"SetTextI18n"})
    public final void q(@NotNull F7<T> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        Object value = this.u.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-titleView>(...)");
        ((TextView) value).setText("View type " + item.a);
    }
}
