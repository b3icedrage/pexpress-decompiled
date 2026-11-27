package com.base.feature.support.chat.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.api.core.BaseFragment;
import com.jivosite.sdk.ui.chat.JivoChatFragment;
import com.pexpress.tool.R;
import defpackage.C0690Bq;
import defpackage.C0768Cq;
import defpackage.C0846Dq;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C5881pB;
import defpackage.C6399rg;
import defpackage.C7276vq;
import defpackage.EnumC4403iP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC2311Wi0;
import defpackage.InterfaceC2415Xi0;
import defpackage.InterfaceC3770fO0;
import defpackage.InterfaceC7441wd2;
import defpackage.T2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/base/feature/support/chat/screens/BaseJivoChatFragment;", "Lcom/api/core/BaseFragment;", "LWi0;", "Lvq;", "LXi0;", "LpB;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseJivoChatFragment extends BaseFragment implements InterfaceC2311Wi0<C7276vq>, InterfaceC2415Xi0<C5881pB> {

    @NotNull
    public final x.b h;

    @Nullable
    public InterfaceC7441wd2 i;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7276vq> {
        public static final a m = new a(3, C7276vq.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/BaseChatWithSupportFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C7276vq k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.base_chat_with_support_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            return new C7276vq(frameLayout, frameLayout);
        }
    }

    public BaseJivoChatFragment(@NotNull x.b viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.h = viewModelFactory;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C6399rg c6399rg = new C6399rg(this, 2);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C0690Bq(new T2(this, 2), 0));
        return C2151Ui0.a(this, C2017Sp1.a.b(C5881pB.class), new C0768Cq(interfaceC3770fO0A, 0), new C0846Dq(interfaceC3770fO0A), c6399rg);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7276vq> g() {
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C5881pB c5881pB = (C5881pB) c().getValue();
        Intrinsics.checkNotNull(c5881pB);
        c5881pB.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.i = (InterfaceC7441wd2) a.m.k(inflater, viewGroup, Boolean.FALSE);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
        InterfaceC7441wd2 interfaceC7441wd2 = this.i;
        Intrinsics.c(interfaceC7441wd2, "null cannot be cast to non-null type com.base.feature.support.databinding.BaseChatWithSupportFragmentBinding");
        aVar.c(((C7276vq) interfaceC7441wd2).e.getId(), new JivoChatFragment(), null, 1);
        aVar.e(false);
        InterfaceC7441wd2 interfaceC7441wd3 = this.i;
        Intrinsics.c(interfaceC7441wd3, "null cannot be cast to non-null type com.base.feature.support.databinding.BaseChatWithSupportFragmentBinding");
        FrameLayout frameLayout = ((C7276vq) interfaceC7441wd3).d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.i = null;
        super.onDestroyView();
    }
}
