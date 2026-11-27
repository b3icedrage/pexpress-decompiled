package com.base.feature.robot.assetselection.screens;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.api.feature.bottomsheetdialog.utils.BindingBottomSheetDialogFragment;
import com.base.feature.robot.assetselection.screens.TradingAssetsBottomSheetDialogFragment;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.impl.feature.robot.tradingassets.TradingAssetsBottomSheetDialogFragmentImpl;
import defpackage.AbstractC5603ns;
import defpackage.AbstractC6898u22;
import defpackage.C1699On1;
import defpackage.C2417Xj;
import defpackage.C3488e22;
import defpackage.C5189lv;
import defpackage.C5429n22;
import defpackage.C5639o22;
import defpackage.C5812or1;
import defpackage.C5849p22;
import defpackage.C6268r22;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.InterfaceC6396rf0;
import defpackage.J9;
import defpackage.K9;
import defpackage.WE;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/robot/assetselection/screens/TradingAssetsBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/BindingBottomSheetDialogFragment;", "Lu22;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TradingAssetsBottomSheetDialogFragment extends BindingBottomSheetDialogFragment<AbstractC6898u22> {

    @NotNull
    public final AbstractC5603ns i;

    @NotNull
    public final C6268r22 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingAssetsBottomSheetDialogFragment(@NotNull AbstractC5603ns bindingFactory, @NotNull C6268r22 binding) {
        super(binding);
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.i = bindingFactory;
        this.j = binding;
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C6268r22 c6268r22 = this.j;
        RecyclerView recyclerViewR = c6268r22.r();
        TradingAssetsBottomSheetDialogFragmentImpl tradingAssetsBottomSheetDialogFragmentImpl = (TradingAssetsBottomSheetDialogFragmentImpl) this;
        Object obj = tradingAssetsBottomSheetDialogFragmentImpl.g;
        Intrinsics.checkNotNull(obj);
        recyclerViewR.setAdapter(new C3488e22(tradingAssetsBottomSheetDialogFragmentImpl.i, new C5812or1(1, obj, AbstractC6898u22.class, "onAssetClick", "onAssetClick(Lcom/api/feature/trading/models/TradingAsset;)V", 0, 1)));
        RecyclerView recyclerViewR2 = c6268r22.r();
        requireContext();
        recyclerViewR2.setLayoutManager(new LinearLayoutManager());
        SwitchMaterial switchMaterialG0 = c6268r22.g0();
        C2417Xj c2417Xj = c6268r22.d;
        Intrinsics.checkNotNull(c2417Xj);
        TextView itemTitle = c2417Xj.j;
        Intrinsics.checkNotNullExpressionValue(itemTitle, "itemTitle");
        C2417Xj c2417Xj2 = c6268r22.d;
        Intrinsics.checkNotNull(c2417Xj2);
        TextView itemDescription = c2417Xj2.g;
        Intrinsics.checkNotNullExpressionValue(itemDescription, "itemDescription");
        Iterator it = WE.f(switchMaterialG0, itemTitle, itemDescription).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setOnClickListener(new J9(this, i));
        }
        C2417Xj c2417Xj3 = c6268r22.d;
        Intrinsics.checkNotNull(c2417Xj3);
        ImageView assetsSelectionCloseButton = c2417Xj3.e;
        Intrinsics.checkNotNullExpressionValue(assetsSelectionCloseButton, "assetsSelectionCloseButton");
        assetsSelectionCloseButton.setOnClickListener(new K9(this, i));
        Object obj2 = this.g;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On1 = ((AbstractC6898u22) obj2).n;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C5429n22(viewLifecycleOwner, c1699On1, null, this), 3);
        Object obj3 = this.g;
        Intrinsics.checkNotNull(obj3);
        C1699On1 c1699On2 = ((AbstractC6898u22) obj3).o;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C5639o22(viewLifecycleOwner2, c1699On2, null, this), 3);
        Object obj4 = this.g;
        Intrinsics.checkNotNull(obj4);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0 = ((AbstractC6898u22) obj4).l;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C5849p22(viewLifecycleOwner3, interfaceC6396rf0, null, this), 3);
        c6268r22.r().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m22
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                TradingAssetsBottomSheetDialogFragment tradingAssetsBottomSheetDialogFragment = this.d;
                Object obj5 = tradingAssetsBottomSheetDialogFragment.g;
                Intrinsics.checkNotNull(obj5);
                AbstractC6898u22 abstractC6898u22 = (AbstractC6898u22) obj5;
                C6268r22 c6268r23 = tradingAssetsBottomSheetDialogFragment.j;
                boolean z = true;
                if (!c6268r23.r().canScrollVertically(1) && !c6268r23.r().canScrollVertically(-1)) {
                    z = false;
                }
                GP1 gp1 = abstractC6898u22.m;
                Boolean boolValueOf = Boolean.valueOf(z);
                gp1.getClass();
                gp1.m(null, boolValueOf);
            }
        });
    }
}
