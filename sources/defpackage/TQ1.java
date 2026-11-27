package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TQ1 extends RecyclerView.e<YQ> {

    @NotNull
    public final List<List<C3151cR1>> d;

    @NotNull
    public final InterfaceC3570eR1 e;

    /* JADX WARN: Multi-variable type inference failed */
    public TQ1(@NotNull List<? extends List<C3151cR1>> listItems, @NotNull InterfaceC3570eR1 storyClickListener) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(storyClickListener, "storyClickListener");
        this.d = listItems;
        this.e = storyClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        YQ holder = (YQ) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<C3151cR1> items = this.d.get(i);
        Intrinsics.checkNotNullParameter(items, "items");
        C3419di0 c3419di0 = holder.u;
        c3419di0.e.setOnClickListener(new XQ(holder, 0));
        ViewOnTouchListenerC3780fR1 viewOnTouchListenerC3780fR1 = new ViewOnTouchListenerC3780fR1(holder.v);
        ConstraintLayout constraintLayout = c3419di0.d;
        constraintLayout.setOnTouchListener(viewOnTouchListenerC3780fR1);
        LinearLayout linearLayout = c3419di0.i;
        linearLayout.removeAllViews();
        for (C3151cR1 c3151cR1 : items) {
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            C7399wR c7399wR = new C7399wR(context, null, R.attr.progressBarStyleHorizontal);
            c7399wR.setMax(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) c7399wR.getResources().getDimension(com.pexpress.tool.R.dimen.margin_between_progress), 1.0f);
            layoutParams.setMarginEnd((int) c7399wR.getResources().getDimension(com.pexpress.tool.R.dimen.margin_between_progress));
            c7399wR.setProgressDrawable(C6333rM.getDrawable(context, com.pexpress.tool.R.drawable.bg_progress));
            c7399wR.setLayoutParams(layoutParams);
            linearLayout.addView(c7399wR);
        }
        holder.q(items.get(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(com.pexpress.tool.R.layout.fragment_current_story, parent, false);
        int i2 = com.pexpress.tool.R.id.close_view;
        ImageView imageView = (ImageView) C3476e.h(viewInflate, com.pexpress.tool.R.id.close_view);
        if (imageView != null) {
            i2 = com.pexpress.tool.R.id.description;
            TextView textView = (TextView) C3476e.h(viewInflate, com.pexpress.tool.R.id.description);
            if (textView != null) {
                i2 = com.pexpress.tool.R.id.image;
                ImageView imageView2 = (ImageView) C3476e.h(viewInflate, com.pexpress.tool.R.id.image);
                if (imageView2 != null) {
                    i2 = com.pexpress.tool.R.id.progress_list;
                    LinearLayout linearLayout = (LinearLayout) C3476e.h(viewInflate, com.pexpress.tool.R.id.progress_list);
                    if (linearLayout != null) {
                        i2 = com.pexpress.tool.R.id.title;
                        TextView textView2 = (TextView) C3476e.h(viewInflate, com.pexpress.tool.R.id.title);
                        if (textView2 != null) {
                            C3419di0 c3419di0 = new C3419di0((ConstraintLayout) viewInflate, imageView, textView, imageView2, linearLayout, textView2);
                            Intrinsics.checkNotNullExpressionValue(c3419di0, "inflate(...)");
                            return new YQ(c3419di0, this.e);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
