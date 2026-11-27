package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class YQ extends RecyclerView.C {

    @NotNull
    public final C3419di0 u;

    @NotNull
    public final InterfaceC3570eR1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YQ(@NotNull C3419di0 binding, @NotNull InterfaceC3570eR1 storyNavigationClickListener) {
        super(binding.d);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(storyNavigationClickListener, "storyNavigationClickListener");
        this.u = binding;
        this.v = storyNavigationClickListener;
    }

    public final void q(@NotNull C3151cR1 item) {
        String string;
        Intrinsics.checkNotNullParameter(item, "item");
        C3419di0 c3419di0 = this.u;
        Context context = c3419di0.d.getContext();
        Intrinsics.checkNotNull(context);
        TextView textView = c3419di0.j;
        List<Integer> list = item.b;
        String string2 = "";
        Integer num = item.a;
        if (list != null && num != null) {
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            List<Integer> list2 = item.b;
            Intrinsics.checkNotNull(list2);
            ArrayList arrayList = new ArrayList(XE.m(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(context.getString(((Number) it.next()).intValue()));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            string = context.getString(iIntValue, Arrays.copyOf(strArr, strArr.length));
        } else if (num != null) {
            Intrinsics.checkNotNull(num);
            string = context.getString(num.intValue());
        } else {
            string = "";
        }
        textView.setText(string);
        TextView textView2 = c3419di0.g;
        List<Integer> list3 = item.d;
        Integer num2 = item.c;
        if (list3 != null && num2 != null) {
            Intrinsics.checkNotNull(num2);
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNull(list3);
            ArrayList arrayList2 = new ArrayList(XE.m(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(context.getString(((Number) it2.next()).intValue()));
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            string2 = context.getString(iIntValue2, Arrays.copyOf(strArr2, strArr2.length));
        } else if (num2 != null) {
            Intrinsics.checkNotNull(num2);
            string2 = context.getString(num2.intValue());
        }
        textView2.setText(string2);
        String str = item.e;
        if (str != null) {
            ImageView image = c3419di0.h;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            C3435dm0.f(image, str);
        }
    }
}
