package defpackage;

import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ry0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6461ry0 extends RecyclerView.C {

    @NotNull
    public static final a B = new a();

    @Nullable
    public C1027Fy0 A;

    @NotNull
    public final C4311hy0 u;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.b v;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.c w;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.d x;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.e y;

    @NotNull
    public final IndicatorsManualConfigBottomSheetDialogFragment.f z;

    /* JADX INFO: renamed from: ry0$a */
    public static final class a extends p.e<C1027Fy0> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C1027Fy0 c1027Fy0, C1027Fy0 c1027Fy1) {
            C1027Fy0 oldItem = c1027Fy0;
            C1027Fy0 newItem = c1027Fy1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C1027Fy0 c1027Fy0, C1027Fy0 c1027Fy1) {
            C1027Fy0 oldItem = c1027Fy0;
            C1027Fy0 newItem = c1027Fy1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.a.equals(newItem.a);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final Object c(C1027Fy0 c1027Fy0, C1027Fy0 c1027Fy1) {
            C1027Fy0 oldItem = c1027Fy0;
            C1027Fy0 newItem = c1027Fy1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (!oldItem.a.equals(newItem.a)) {
                return null;
            }
            List<C3471dy0> list = oldItem.c;
            int iA = OW0.a(XE.m(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (C3471dy0 c3471dy0 : list) {
                linkedHashMap.put(c3471dy0.a, c3471dy0.b);
            }
            List<C3471dy0> list2 = newItem.c;
            int iA2 = OW0.a(XE.m(list2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
            for (C3471dy0 c3471dy1 : list2) {
                linkedHashMap2.put(c3471dy1.a, c3471dy1.b);
            }
            if (!Intrinsics.a(linkedHashMap.keySet(), linkedHashMap2.keySet()) || Intrinsics.a(linkedHashMap.values(), linkedHashMap2.values())) {
                return null;
            }
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6461ry0(@NotNull C4311hy0 binding, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.b onEdit, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.c onPlus, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.d onMinus, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.e onFocusExit, @NotNull IndicatorsManualConfigBottomSheetDialogFragment.f onClearFocus) {
        super(binding.d);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onPlus, "onPlus");
        Intrinsics.checkNotNullParameter(onMinus, "onMinus");
        Intrinsics.checkNotNullParameter(onFocusExit, "onFocusExit");
        Intrinsics.checkNotNullParameter(onClearFocus, "onClearFocus");
        this.u = binding;
        this.v = onEdit;
        this.w = onPlus;
        this.x = onMinus;
        this.y = onFocusExit;
        this.z = onClearFocus;
    }

    public final void q(@NotNull C1027Fy0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.A = item;
        LinearLayout indicatorManualConfigFields = this.u.g;
        Intrinsics.checkNotNullExpressionValue(indicatorManualConfigFields, "indicatorManualConfigFields");
        List listP = JH1.p(JH1.m(new Id2(indicatorManualConfigFields), new C6224qp(1)));
        List<C3471dy0> list = item.c;
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
            C4559iy0 c4559iy0 = (C4559iy0) obj;
            if (c3471dy0.b.doubleValue() >= 1.0d) {
                EditText indicatorEdittext = c4559iy0.e;
                Intrinsics.checkNotNullExpressionValue(indicatorEdittext, "indicatorEdittext");
                C1874Qu.s(indicatorEdittext, c3471dy0.b.toString());
            }
        }
    }
}
