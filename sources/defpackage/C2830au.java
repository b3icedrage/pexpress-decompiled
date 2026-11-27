package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: au, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2830au extends RecyclerView.e<C6658su> {

    @NotNull
    public final C3668eu d;

    public C2830au(@NotNull C3668eu data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.d = data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int c() {
        return this.d.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        String string;
        C6658su holder = (C6658su) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C5819ou item = this.d.a.get(i);
        Intrinsics.checkNotNullParameter(item, "item");
        BD0 bd0 = holder.u;
        Context context = bd0.d.getContext();
        TextView counter = bd0.e;
        Intrinsics.checkNotNullExpressionValue(counter, "counter");
        counter.setVisibility(8);
        Intrinsics.checkNotNull(context);
        item.getClass();
        String string2 = "";
        Integer num = item.a;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            string = context.getString(num.intValue());
        } else {
            string = "";
        }
        bd0.i.setText(string);
        List<String> list = item.c;
        Integer num2 = item.b;
        if (list != null && num2 != null) {
            Intrinsics.checkNotNull(num2);
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNull(list);
            String[] strArr = (String[]) list.toArray(new String[0]);
            string2 = context.getString(iIntValue, Arrays.copyOf(strArr, strArr.length));
        } else if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            string2 = context.getString(num2.intValue());
        }
        bd0.g.setText(string2);
        String str = item.d;
        if (str != null) {
            ImageView image = bd0.h;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            C3435dm0.c(image, str, item.e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_viewpager, parent, false);
        int i2 = R.id.counter;
        TextView textView = (TextView) C3476e.h(viewInflate, R.id.counter);
        if (textView != null) {
            i2 = R.id.description;
            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.description);
            if (textView2 != null) {
                i2 = R.id.image;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.image);
                if (imageView != null) {
                    i2 = R.id.image_card;
                    if (((MaterialCardView) C3476e.h(viewInflate, R.id.image_card)) != null) {
                        i2 = R.id.title;
                        TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.title);
                        if (textView3 != null) {
                            BD0 bd0 = new BD0((ConstraintLayout) viewInflate, textView, textView2, imageView, textView3);
                            Intrinsics.checkNotNullExpressionValue(bd0, "inflate(...)");
                            return new C6658su(bd0);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
