package com.base.feature.support.support.screens.common;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C4422iV1;
import defpackage.C6029pu;
import defpackage.EV1;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3371dV;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/common/BottomSheetSupportItemFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "Lpu;", "LEV1;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetSupportItemFragment extends SimpleBottomSheetWithDataFragment<C6029pu, EV1> {

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6029pu> {
        public static final a m = new a(3, C6029pu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/BottomSheetSupportItemBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6029pu k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.bottom_sheet_support_item, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.button);
            if (materialButton != null) {
                i = R.id.button_spacer;
                if (((Space) C3476e.h(viewInflate, R.id.button_spacer)) != null) {
                    i = R.id.description;
                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.description);
                    if (textView != null) {
                        i = R.id.description_spacer;
                        if (((Space) C3476e.h(viewInflate, R.id.description_spacer)) != null) {
                            i = R.id.icon;
                            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                            if (imageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i = R.id.title;
                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
                                if (textView2 != null) {
                                    i = R.id.title_icon_container;
                                    if (((LinearLayout) C3476e.h(viewInflate, R.id.title_icon_container)) != null) {
                                        return new C6029pu(imageView, textView, textView2, constraintLayout, materialButton);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetSupportItemFragment(@NotNull C4422iV1 supportBottomSheetDataProvider, @NotNull InterfaceC3371dV defaultDialogCallbacks) {
        super(supportBottomSheetDataProvider, defaultDialogCallbacks);
        Intrinsics.checkNotNullParameter(supportBottomSheetDataProvider, "supportBottomSheetDataProvider");
        Intrinsics.checkNotNullParameter(defaultDialogCallbacks, "defaultDialogCallbacks");
        this.j = a.m;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6029pu> g() {
        return this.j;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    public final void i(EV1 ev1) {
        String string;
        String string2;
        final EV1 data = ev1;
        Intrinsics.checkNotNullParameter(data, "data");
        C6029pu c6029puJ = j();
        List<String> list = data.d;
        int i = data.c;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            String[] strArr = (String[]) list.toArray(new String[0]);
            string = getString(i, Arrays.copyOf(strArr, strArr.length));
        } else {
            string = getString(i);
        }
        c6029puJ.g.setText(string);
        C6029pu c6029puJ2 = j();
        int i2 = data.a;
        List<Integer> list2 = data.b;
        if (list2 != null) {
            Intrinsics.checkNotNull(list2);
            ArrayList arrayList = new ArrayList(XE.m(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getString(((Number) it.next()).intValue()));
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            string2 = getString(i2, Arrays.copyOf(strArr2, strArr2.length));
        } else {
            string2 = getString(i2);
        }
        c6029puJ2.i.setText(string2);
        ImageView icon = j().h;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        C3435dm0.d(icon, data.e);
        MaterialButton button = j().e;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        button.setVisibility(data.f == null ? 8 : 0);
        j().e.setOnClickListener(new View.OnClickListener() { // from class: qu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.dismiss();
                C7239vg c7239vg = data.f;
                if (c7239vg != null) {
                    c7239vg.invoke();
                }
            }
        });
    }
}
