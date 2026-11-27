package com.base.feature.registration.screens.duoauth;

import android.os.Bundle;
import android.view.View;
import com.api.core.ViewModelFragment;
import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import defpackage.C0738Cg;
import defpackage.C1699On1;
import defpackage.C3296d7;
import defpackage.C5189lv;
import defpackage.C6694t40;
import defpackage.C6904u40;
import defpackage.C7114v40;
import defpackage.C7324w40;
import defpackage.C7535x40;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.I9;
import defpackage.InterfaceC5435n40;
import defpackage.K40;
import defpackage.ViewOnClickListenerC3273d10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/registration/screens/duoauth/DuoAuthFragmentBase;", "LK40;", "VM", "Lcom/api/core/ViewModelFragment;", "FeatureRegistrationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DuoAuthFragmentBase<VM extends K40> extends ViewModelFragment<K40> {

    @NotNull
    public final InterfaceC5435n40 j;

    @NotNull
    public final C3296d7 k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DuoAuthType.values().length];
            try {
                iArr[DuoAuthType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DuoAuthType.GOOGLE_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DuoAuthType.SMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DuoAuthType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DuoAuthType.PUSH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DuoAuthType.FB_MESSENGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuoAuthFragmentBase(@NotNull InterfaceC5435n40 bindingProvider, @NotNull C3296d7 onBackPressedProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        this.j = bindingProvider;
        this.k = onBackPressedProvider;
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        this.k.a = null;
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        this.k.a = new C0738Cg(this, 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC5435n40 interfaceC5435n40 = this.j;
        interfaceC5435n40.q().setOnClickListener(new ViewOnClickListenerC3273d10(this, 1));
        interfaceC5435n40.O().setOnClickListener(new I9(this, 2));
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        K40 k40 = (K40) obj;
        C1699On1 c1699On1 = k40.g;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C6694t40(viewLifecycleOwner, c1699On1, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C6904u40(viewLifecycleOwner2, k40.j, null, this), 3);
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C7114v40(viewLifecycleOwner3, k40.k, null, this), 3);
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C7324w40(viewLifecycleOwner4, k40.i, null, this), 3);
        interfaceC5435n40.R().addTextChangedListener(new C7535x40(this));
        interfaceC5435n40.R().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: s40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                Object obj2 = this.a.i;
                Intrinsics.checkNotNull(obj2);
                GP1 gp1 = ((K40) obj2).h;
                Boolean boolValueOf = Boolean.valueOf(z);
                gp1.getClass();
                gp1.m(null, boolValueOf);
            }
        });
    }
}
