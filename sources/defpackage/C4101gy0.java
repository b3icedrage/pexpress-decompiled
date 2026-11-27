package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import com.pexpress.tool.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4101gy0 extends v<C1027Fy0, C6461ry0> {

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.b e;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.c f;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.d g;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.e h;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4101gy0(@NotNull IndicatorsManualConfigBottomSheetDialogFragment.b onEdit, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.c onPlus, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.d onMinus, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.e onFocusExit, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.f onClearFocus) {
        super(C6461ry0.B);
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onPlus, "onPlus");
        Intrinsics.checkNotNullParameter(onMinus, "onMinus");
        Intrinsics.checkNotNullParameter(onFocusExit, "onFocusExit");
        Intrinsics.checkNotNullParameter(onClearFocus, "onClearFocus");
        this.e = onEdit;
        this.f = onPlus;
        this.g = onMinus;
        this.h = onFocusExit;
        this.i = onClearFocus;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        List<C3471dy0> list;
        LinearLayout indicatorManualConfigFields;
        final C6461ry0 holder = (C6461ry0) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C1027Fy0 c1027Fy0O = o(i);
        Intrinsics.checkNotNullExpressionValue(c1027Fy0O, "getItem(...)");
        C1027Fy0 item = c1027Fy0O;
        Intrinsics.checkNotNullParameter(item, "item");
        C4311hy0 c4311hy0 = holder.u;
        Context context = c4311hy0.d.getContext();
        c4311hy0.d.setOnClickListener(new ViewOnClickListenerC5622ny0(holder, 0));
        c4311hy0.h.setText(item.a);
        c4311hy0.e.setImageTintList(ColorStateList.valueOf(Color.parseColor(item.b)));
        while (true) {
            list = item.c;
            int size = list.size();
            indicatorManualConfigFields = c4311hy0.g;
            if (size >= indicatorManualConfigFields.getChildCount()) {
                break;
            }
            Intrinsics.checkNotNullExpressionValue(indicatorManualConfigFields, "indicatorManualConfigFields");
            indicatorManualConfigFields.removeViewAt(f.i(0, indicatorManualConfigFields.getChildCount()).e);
        }
        while (list.size() > indicatorManualConfigFields.getChildCount()) {
            C4559iy0 c4559iy0B = C4559iy0.b(LayoutInflater.from(context).inflate(R.layout.indicator_manual_config_bottom_sheet_edit_field, (ViewGroup) indicatorManualConfigFields, false));
            Intrinsics.checkNotNullExpressionValue(c4559iy0B, "inflate(...)");
            final EnumC7224vc0 enumC7224vc0 = list.get(indicatorManualConfigFields.getChildCount()).a;
            EditText indicatorEdittext = c4559iy0B.e;
            Intrinsics.checkNotNullExpressionValue(indicatorEdittext, "indicatorEdittext");
            indicatorEdittext.addTextChangedListener(new C6671sy0(holder, enumC7224vc0));
            c4559iy0B.g.setOnClickListener(new View.OnClickListener() { // from class: oy0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6461ry0 c6461ry0 = holder;
                    c6461ry0.x.invoke(enumC7224vc0);
                }
            });
            c4559iy0B.h.setOnClickListener(new View.OnClickListener() { // from class: py0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6461ry0 c6461ry0 = holder;
                    c6461ry0.w.invoke(enumC7224vc0);
                }
            });
            indicatorEdittext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: qy0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        return;
                    }
                    C6461ry0 c6461ry0 = holder;
                    c6461ry0.y.invoke(enumC7224vc0);
                    C1027Fy0 c1027Fy0 = c6461ry0.A;
                    if (c1027Fy0 != null) {
                        c6461ry0.q(c1027Fy0);
                    }
                }
            });
            indicatorManualConfigFields.addView(c4559iy0B.d);
        }
        Intrinsics.checkNotNullExpressionValue(indicatorManualConfigFields, "indicatorManualConfigFields");
        List listP = JH1.p(JH1.m(new Id2(indicatorManualConfigFields), new MB(2)));
        Iterator<T> it = list.iterator();
        Iterator it2 = listP.iterator();
        ArrayList<Pair> arrayList = new ArrayList(Math.min(XE.m(list, 10), XE.m(listP, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair((C3471dy0) it.next(), (C4559iy0) it2.next()));
        }
        for (Pair pair : arrayList) {
            C3471dy0 c3471dy0 = (C3471dy0) pair.d;
            Object obj = pair.e;
            Intrinsics.checkNotNullExpressionValue(obj, "component2(...)");
            ((C4559iy0) obj).e.setInputType(c3471dy0.b instanceof Double ? 8194 : 2);
        }
        holder.q(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void h(RecyclerView.C c, int i, List payloads) {
        C6461ry0 holder = (C6461ry0) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            g(holder, i);
            return;
        }
        Object objO = o(i);
        Intrinsics.checkNotNullExpressionValue(objO, "getItem(...)");
        holder.q((C1027Fy0) objO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.indicator_manual_config_bottom_sheet_edit_block, parent, false);
        int i2 = R.id.indicator_manual_config_color;
        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.indicator_manual_config_color);
        if (imageView != null) {
            i2 = R.id.indicator_manual_config_fields;
            LinearLayout linearLayout = (LinearLayout) C3476e.h(viewInflate, R.id.indicator_manual_config_fields);
            if (linearLayout != null) {
                i2 = R.id.indicator_manual_config_header;
                if (((LinearLayout) C3476e.h(viewInflate, R.id.indicator_manual_config_header)) != null) {
                    i2 = R.id.indicator_manual_config_name;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.indicator_manual_config_name);
                    if (textView != null) {
                        C4311hy0 c4311hy0 = new C4311hy0((CardView) viewInflate, imageView, linearLayout, textView);
                        Intrinsics.checkNotNullExpressionValue(c4311hy0, "inflate(...)");
                        return new C6461ry0(c4311hy0, this.e, this.f, this.g, this.h, this.i);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
