package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: r22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6268r22 implements InterfaceC6856tq {

    @Nullable
    public C2417Xj d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.asset_selection_bottom_sheet_dialog_fragment, viewGroup, false);
        int i = R.id.assets_selection_close_button;
        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.assets_selection_close_button);
        if (imageView != null) {
            i = R.id.assets_selection_title;
            if (((TextView) C3476e.h(viewInflate, R.id.assets_selection_title)) != null) {
                i = R.id.divider_header_asset;
                if (C3476e.h(viewInflate, R.id.divider_header_asset) != null) {
                    i = R.id.divider_recycler_asset;
                    if (C3476e.h(viewInflate, R.id.divider_recycler_asset) != null) {
                        i = R.id.item_description;
                        TextView textView = (TextView) C3476e.h(viewInflate, R.id.item_description);
                        if (textView != null) {
                            i = R.id.item_switch;
                            SwitchMaterial switchMaterial = (SwitchMaterial) C3476e.h(viewInflate, R.id.item_switch);
                            if (switchMaterial != null) {
                                i = R.id.item_switch_card;
                                MotionLayout motionLayout = (MotionLayout) C3476e.h(viewInflate, R.id.item_switch_card);
                                if (motionLayout != null) {
                                    i = R.id.item_title;
                                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.item_title);
                                    if (textView2 != null) {
                                        i = R.id.recycler;
                                        RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.recycler);
                                        if (recyclerView != null) {
                                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                                            C2417Xj c2417Xj = new C2417Xj(frameLayout, imageView, textView, switchMaterial, motionLayout, textView2, recyclerView);
                                            this.d = c2417Xj;
                                            Intrinsics.checkNotNull(c2417Xj);
                                            Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
                                            return frameLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @NotNull
    public final SwitchMaterial g0() {
        C2417Xj c2417Xj = this.d;
        Intrinsics.checkNotNull(c2417Xj);
        SwitchMaterial itemSwitch = c2417Xj.h;
        Intrinsics.checkNotNullExpressionValue(itemSwitch, "itemSwitch");
        return itemSwitch;
    }

    @NotNull
    public final RecyclerView r() {
        C2417Xj c2417Xj = this.d;
        Intrinsics.checkNotNull(c2417Xj);
        RecyclerView recycler = c2417Xj.k;
        Intrinsics.checkNotNullExpressionValue(recycler, "recycler");
        return recycler;
    }
}
