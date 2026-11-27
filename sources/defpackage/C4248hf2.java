package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4248hf2 extends v<C4038gf2, C4457if2> {

    @NotNull
    public static final a e = new a();

    /* JADX INFO: renamed from: hf2$a */
    public static final class a extends p.e<C4038gf2> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C4038gf2 c4038gf2, C4038gf2 c4038gf3) {
            C4038gf2 oldItem = c4038gf2;
            C4038gf2 newItem = c4038gf3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C4038gf2 c4038gf2, C4038gf2 c4038gf3) {
            C4038gf2 oldItem = c4038gf2;
            C4038gf2 newItem = c4038gf3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.a == newItem.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        C4457if2 holder = (C4457if2) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C4038gf2 c4038gf2O = o(i);
        Intrinsics.checkNotNullExpressionValue(c4038gf2O, "getItem(...)");
        C4038gf2 vpnInstructionItem = c4038gf2O;
        Intrinsics.checkNotNullParameter(vpnInstructionItem, "vpnInstructionItem");
        C5769of2 c5769of2 = holder.u;
        ImageView vpnInstructionItemImage = c5769of2.h;
        Intrinsics.checkNotNullExpressionValue(vpnInstructionItemImage, "vpnInstructionItemImage");
        C3435dm0.f(vpnInstructionItemImage, vpnInstructionItem.c);
        TextView description = c5769of2.e;
        description.setText(vpnInstructionItem.b);
        String str = vpnInstructionItem.d;
        if (str.length() > 0) {
            Intrinsics.checkNotNullExpressionValue(description, "description");
            List highlightParams = VE.c(new C0685Bo0(str, R.color.vpnInstructionItemDescriptionHighlighted, null, 20));
            Intrinsics.checkNotNullParameter(description, "<this>");
            Intrinsics.checkNotNullParameter(highlightParams, "highlightParams");
            CharSequence text = description.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            Context context = description.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            description.setText(C5109lY1.a(text, highlightParams, context));
            description.setMovementMethod(LinkMovementMethod.getInstance());
        }
        c5769of2.g.setText(String.valueOf(vpnInstructionItem.a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.vpn_item, parent, false);
        int i2 = R.id.description;
        TextView textView = (TextView) C3476e.h(viewInflate, R.id.description);
        if (textView != null) {
            i2 = R.id.number_text;
            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.number_text);
            if (textView2 != null) {
                i2 = R.id.vpn_instruction_item_image;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.vpn_instruction_item_image);
                if (imageView != null) {
                    C5769of2 c5769of2 = new C5769of2(imageView, textView, textView2, (ConstraintLayout) viewInflate);
                    Intrinsics.checkNotNullExpressionValue(c5769of2, "inflate(...)");
                    return new C4457if2(c5769of2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
