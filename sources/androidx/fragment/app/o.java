package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.AbstractC4726ji0;
import defpackage.C1057Gi0;
import defpackage.C1332Jw;
import defpackage.C5345me2;
import defpackage.C5807oq;
import defpackage.C6003pl2;
import defpackage.C6213ql2;
import defpackage.Cd2;
import defpackage.SK;
import defpackage.Wd2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final k a;
    public final p b;

    @NonNull
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View d;

        public a(View view) {
            this.d = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.d;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            Cd2.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public o(@NonNull k kVar, @NonNull p pVar, @NonNull Fragment fragment) {
        this.a = kVar;
        this.b = pVar;
        this.c = fragment;
    }

    public final void a() {
        Fragment expectedParentFragment;
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.c;
        View view3 = fragment.mContainer;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment2 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment2 != null) {
                expectedParentFragment = fragment2;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i = fragment.mContainerId;
            C1057Gi0.b bVar = C1057Gi0.a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(expectedParentFragment);
            sb.append(" via container with ID ");
            C1057Gi0.b(new C6213ql2(fragment, SK.b(sb, i, " without using parent's childFragmentManager")));
            C1057Gi0.a(fragment).a.contains(C1057Gi0.a.g);
        }
        p pVar = this.b;
        pVar.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = pVar.a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                Fragment fragment3 = arrayList.get(i2);
                if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment4 = arrayList.get(iIndexOf);
                if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zG = FragmentManager.G(3);
        Fragment fragment = this.c;
        if (zG) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        o oVar = null;
        p pVar = this.b;
        if (fragment2 != null) {
            o oVar2 = pVar.b.get(fragment2.mWho);
            if (oVar2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            oVar = oVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (oVar = pVar.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C5807oq.b(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (oVar != null) {
            oVar.i();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.u;
        fragment.mParentFragment = fragmentManager.w;
        k kVar = this.a;
        kVar.g(fragment, false);
        fragment.performAttach();
        kVar.b(fragment, false);
    }

    public final int c() {
        Object next;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        s.b.a aVar = null;
        if (viewGroup != null) {
            s sVarF = s.f(viewGroup, fragment.getParentFragmentManager());
            sVarF.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            s.b bVarD = sVarF.d(fragment);
            s.b.a aVar2 = bVarD != null ? bVarD.b : null;
            Iterator it = sVarF.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                s.b bVar = (s.b) next;
                if (Intrinsics.a(bVar.c, fragment) && !bVar.f) {
                    break;
                }
            }
            s.b bVar2 = (s.b) next;
            aVar = bVar2 != null ? bVar2.b : null;
            int i = aVar2 == null ? -1 : s.c.a[aVar2.ordinal()];
            if (i != -1 && i != 1) {
                aVar = aVar2;
            }
        }
        if (aVar == s.b.a.e) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == s.b.a.g) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.G(2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() {
        String resourceName;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.G(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(C1332Jw.b("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.v.b(i);
                if (container == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    C1057Gi0.b bVar = C1057Gi0.a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    C1057Gi0.b(new C6003pl2(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView"));
                    C1057Gi0.a(fragment).a.contains(C1057Gi0.a.k);
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.G(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            if (view.isAttachedToWindow()) {
                Cd2.c.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.G(2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zG = FragmentManager.G(3);
        Fragment fragment = this.c;
        if (zG) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        p pVar = this.b;
        if (z && !fragment.mBeingSaved) {
            pVar.i(fragment.mWho, null);
        }
        if (!z) {
            m mVar = pVar.d;
            if (!((mVar.d.containsKey(fragment.mWho) && mVar.g) ? mVar.h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = pVar.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        AbstractC4726ji0<?> abstractC4726ji0 = fragment.mHost;
        if (abstractC4726ji0 instanceof Wd2) {
            zIsChangingConfigurations = pVar.d.h;
        } else {
            g gVar = abstractC4726ji0.e;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            m mVar2 = pVar.d;
            mVar2.getClass();
            if (FragmentManager.G(3)) {
                Objects.toString(fragment);
            }
            mVar2.k(fragment.mWho);
        }
        fragment.performDestroy();
        this.a.d(fragment, false);
        for (o oVar : pVar.d()) {
            if (oVar != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = oVar.c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = pVar.b(str3);
        }
        pVar.h(this);
    }

    public final void f() {
        View view;
        boolean zG = FragmentManager.G(3);
        Fragment fragment = this.c;
        if (zG) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zG = FragmentManager.G(3);
        Fragment fragment = this.c;
        if (zG) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            m mVar = this.b.d;
            if (!((mVar.d.containsKey(fragment.mWho) && mVar.g) ? mVar.h : true)) {
                return;
            }
        }
        if (FragmentManager.G(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.G(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (FragmentManager.G(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = fragment.mState;
                s.b.EnumC0232b finalState = s.b.EnumC0232b.e;
                s.b.EnumC0232b enumC0232b = s.b.EnumC0232b.g;
                p pVar = this.b;
                if (iC == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.G(3)) {
                            Objects.toString(fragment);
                        }
                        m mVar = pVar.d;
                        mVar.getClass();
                        if (FragmentManager.G(3)) {
                            Objects.toString(fragment);
                        }
                        mVar.k(fragment.mWho);
                        pVar.h(this);
                        if (FragmentManager.G(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            s sVarF = s.f(viewGroup, fragment.getParentFragmentManager());
                            boolean z3 = fragment.mHidden;
                            s.b.a aVar = s.b.a.d;
                            if (z3) {
                                sVarF.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.G(2)) {
                                    Objects.toString(fragment);
                                }
                                sVarF.a(enumC0232b, aVar, this);
                            } else {
                                sVarF.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.G(2)) {
                                    Objects.toString(fragment);
                                }
                                sVarF.a(finalState, aVar, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.H(fragment)) {
                            fragmentManager.F = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    this.d = false;
                    return;
                }
                k kVar = this.a;
                if (iC > i) {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                kVar.h(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                kVar.c(fragment, bundle, false);
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            kVar.a(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                s sVarF2 = s.f(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        finalState = s.b.EnumC0232b.h;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        finalState = enumC0232b;
                                    }
                                }
                                sVarF2.getClass();
                                Intrinsics.checkNotNullParameter(finalState, "finalState");
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.G(2)) {
                                    Objects.toString(fragment);
                                }
                                sVarF2.a(finalState, s.b.a.e, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            kVar.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (pVar.c.get(fragment.mWho) == null) {
                                    pVar.i(fragment.mWho, l());
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                pVar.i(fragment.mWho, l());
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                s sVarF3 = s.f(viewGroup2, fragment.getParentFragmentManager());
                                sVarF3.getClass();
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (FragmentManager.G(2)) {
                                    Objects.toString(fragment);
                                }
                                sVarF3.a(s.b.EnumC0232b.d, s.b.a.g, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            kVar.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.G(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            kVar.f(fragment, false);
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void j(@NonNull ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        n nVar = (n) fragment.mSavedFragmentState.getParcelable("state");
        if (nVar != null) {
            fragment.mTargetWho = nVar.p;
            fragment.mTargetRequestCode = nVar.q;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = nVar.r;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void k() {
        boolean zG = FragmentManager.G(3);
        Fragment fragment = this.c;
        if (zG) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                focusedView.requestFocus();
                if (FragmentManager.G(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (FragmentManager.G(2)) {
                    focusedView.toString();
                    Objects.toString(fragment);
                    Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.i(fragment, false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @NonNull
    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new n(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = fragment.mChildFragmentManager.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.G(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public o(@NonNull k kVar, @NonNull p pVar, @NonNull ClassLoader classLoader, @NonNull i iVar, @NonNull Bundle bundle) {
        this.a = kVar;
        this.b = pVar;
        n nVar = (n) bundle.getParcelable("state");
        Fragment fragmentA = iVar.a(classLoader, nVar.d);
        fragmentA.mWho = nVar.e;
        fragmentA.mFromLayout = nVar.g;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = nVar.h;
        fragmentA.mContainerId = nVar.i;
        fragmentA.mTag = nVar.j;
        fragmentA.mRetainInstance = nVar.k;
        fragmentA.mRemoving = nVar.l;
        fragmentA.mDetached = nVar.m;
        fragmentA.mHidden = nVar.n;
        fragmentA.mMaxState = androidx.lifecycle.g.b.values()[nVar.o];
        fragmentA.mTargetWho = nVar.p;
        fragmentA.mTargetRequestCode = nVar.q;
        fragmentA.mUserVisibleHint = nVar.r;
        this.c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.G(2)) {
            Objects.toString(fragmentA);
        }
    }

    public o(@NonNull k kVar, @NonNull p pVar, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.a = kVar;
        this.b = pVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
