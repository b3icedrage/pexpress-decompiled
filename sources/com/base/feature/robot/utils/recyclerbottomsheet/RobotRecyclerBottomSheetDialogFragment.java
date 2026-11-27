package com.base.feature.robot.utils.recyclerbottomsheet;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e;
import androidx.recyclerview.widget.q;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC7066uq;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C6333rM;
import defpackage.C6868tu;
import defpackage.InterfaceC1060Gj0;
import defpackage.ViewOnClickListenerC0717Bz;
import defpackage.ViewOnClickListenerC7950z3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/feature/robot/utils/recyclerbottomsheet/RobotRecyclerBottomSheetDialogFragment;", "Landroidx/recyclerview/widget/RecyclerView$e;", "A", "Luq;", "VM", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "Ltu;", "<init>", "()V", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RobotRecyclerBottomSheetDialogFragment<A extends RecyclerView.e<?>, VM extends AbstractC7066uq> extends SimpleBindingBottomSheetDialogFragment<VM, C6868tu> {

    @NotNull
    public final String i = "";

    @NotNull
    public final a j = a.m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6868tu> {
        public static final a m = new a(3, C6868tu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/BottomSheetWithRecyclerFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6868tu k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.bottom_sheet_with_recycler_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.bottom_sheet_with_recycler_close_icon;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_close_icon);
            if (imageView != null) {
                i = R.id.bottom_sheet_with_recycler_help_icon;
                ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_help_icon);
                if (imageView2 != null) {
                    i = R.id.bottom_sheet_with_recycler_recycler;
                    RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_recycler);
                    if (recyclerView != null) {
                        i = R.id.bottom_sheet_with_recycler_title;
                        TextView textView = (TextView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_title);
                        if (textView != null) {
                            return new C6868tu((LinearLayout) viewInflate, imageView, imageView2, recyclerView, textView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6868tu> g() {
        return this.j;
    }

    @NotNull
    public abstract A j();

    @Nullable
    public RecyclerView.l k() {
        q qVar = new q(getContext(), 1);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Drawable drawable = C6333rM.getDrawable(requireContext(), R.drawable.default_recycler_bottom_sheet_dvivider);
        Intrinsics.checkNotNull(drawable);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        qVar.a = drawable;
        return qVar;
    }

    @NotNull
    public final A l() {
        A a2 = (A) i().h.getAdapter();
        Intrinsics.c(a2, "null cannot be cast to non-null type A of com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment");
        return a2;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public String getI() {
        return this.i;
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C6868tu c6868tuI = i();
        c6868tuI.e.setOnClickListener(new ViewOnClickListenerC7950z3(this, 2));
        i().i.setText(getI());
        ImageView imageView = i().g;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(4);
        imageView.setOnClickListener(new ViewOnClickListenerC0717Bz(this, 2));
        i().h.setAdapter(j());
        C6868tu c6868tuI2 = i();
        requireContext();
        c6868tuI2.h.setLayoutManager(new LinearLayoutManager());
        RecyclerView.l lVarK = k();
        if (lVarK != null) {
            i().h.g(lVarK);
        }
    }
}
