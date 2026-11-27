package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.NonNull;
import defpackage.AbstractC4726ji0;
import defpackage.AbstractC5700oK1;
import defpackage.AbstractC6705t7;
import defpackage.AbstractC6769tR0;
import defpackage.C0809Dd1;
import defpackage.C2073Ti0;
import defpackage.C3209ci0;
import defpackage.C6828ti0;
import defpackage.InterfaceC3096c91;
import defpackage.InterfaceC3174cZ0;
import defpackage.InterfaceC3725f91;
import defpackage.InterfaceC3760fL;
import defpackage.InterfaceC5324mZ0;
import defpackage.InterfaceC5666o91;
import defpackage.InterfaceC7038ui0;
import defpackage.InterfaceC7546x7;
import defpackage.K11;
import defpackage.OC1;
import defpackage.Q81;
import defpackage.U81;
import defpackage.Vd2;
import defpackage.W81;
import defpackage.Wd2;
import defpackage.Y6;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class g extends ComponentActivity implements Y6.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.l mFragmentLifecycleRegistry;
    final C3209ci0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends AbstractC4726ji0<g> implements U81, InterfaceC5666o91, InterfaceC3096c91, InterfaceC3725f91, Wd2, Q81, InterfaceC7546x7, OC1, InterfaceC7038ui0, InterfaceC3174cZ0 {
        public a() {
            super(g.this);
        }

        @Override // defpackage.InterfaceC7038ui0
        public final void a(@NonNull Fragment fragment) {
            g.this.onAttachFragment(fragment);
        }

        @Override // defpackage.InterfaceC3174cZ0
        public final void addMenuProvider(@NonNull InterfaceC5324mZ0 interfaceC5324mZ0) {
            g.this.addMenuProvider(interfaceC5324mZ0);
        }

        @Override // defpackage.U81
        public final void addOnConfigurationChangedListener(@NonNull InterfaceC3760fL<Configuration> interfaceC3760fL) {
            g.this.addOnConfigurationChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC3096c91
        public final void addOnMultiWindowModeChangedListener(@NonNull InterfaceC3760fL<K11> interfaceC3760fL) {
            g.this.addOnMultiWindowModeChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC3725f91
        public final void addOnPictureInPictureModeChangedListener(@NonNull InterfaceC3760fL<C0809Dd1> interfaceC3760fL) {
            g.this.addOnPictureInPictureModeChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC5666o91
        public final void addOnTrimMemoryListener(@NonNull InterfaceC3760fL<Integer> interfaceC3760fL) {
            g.this.addOnTrimMemoryListener(interfaceC3760fL);
        }

        @Override // defpackage.AbstractC3000bi0
        public final View b(int i) {
            return g.this.findViewById(i);
        }

        @Override // defpackage.AbstractC3000bi0
        public final boolean c() {
            Window window = g.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // defpackage.AbstractC4726ji0
        public final void d(@NonNull PrintWriter printWriter, String[] strArr) {
            g.this.dump("  ", null, printWriter, strArr);
        }

        @Override // defpackage.AbstractC4726ji0
        public final g e() {
            return g.this;
        }

        @Override // defpackage.AbstractC4726ji0
        @NonNull
        public final LayoutInflater f() {
            g gVar = g.this;
            return gVar.getLayoutInflater().cloneInContext(gVar);
        }

        @Override // defpackage.AbstractC4726ji0
        public final boolean g(@NonNull String str) {
            return Y6.b(g.this, str);
        }

        @Override // defpackage.InterfaceC7546x7
        @NonNull
        public final AbstractC6705t7 getActivityResultRegistry() {
            return g.this.getActivityResultRegistry();
        }

        @Override // defpackage.FP0
        @NonNull
        public final androidx.lifecycle.g getLifecycle() {
            return g.this.mFragmentLifecycleRegistry;
        }

        @Override // defpackage.Q81
        @NonNull
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return g.this.getOnBackPressedDispatcher();
        }

        @Override // defpackage.OC1
        @NonNull
        public final androidx.savedstate.a getSavedStateRegistry() {
            return g.this.getSavedStateRegistry();
        }

        @Override // defpackage.Wd2
        @NonNull
        public final Vd2 getViewModelStore() {
            return g.this.getViewModelStore();
        }

        @Override // defpackage.AbstractC4726ji0
        public final void h() {
            g.this.invalidateMenu();
        }

        @Override // defpackage.InterfaceC3174cZ0
        public final void removeMenuProvider(@NonNull InterfaceC5324mZ0 interfaceC5324mZ0) {
            g.this.removeMenuProvider(interfaceC5324mZ0);
        }

        @Override // defpackage.U81
        public final void removeOnConfigurationChangedListener(@NonNull InterfaceC3760fL<Configuration> interfaceC3760fL) {
            g.this.removeOnConfigurationChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC3096c91
        public final void removeOnMultiWindowModeChangedListener(@NonNull InterfaceC3760fL<K11> interfaceC3760fL) {
            g.this.removeOnMultiWindowModeChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC3725f91
        public final void removeOnPictureInPictureModeChangedListener(@NonNull InterfaceC3760fL<C0809Dd1> interfaceC3760fL) {
            g.this.removeOnPictureInPictureModeChangedListener(interfaceC3760fL);
        }

        @Override // defpackage.InterfaceC5666o91
        public final void removeOnTrimMemoryListener(@NonNull InterfaceC3760fL<Integer> interfaceC3760fL) {
            g.this.removeOnTrimMemoryListener(interfaceC3760fL);
        }
    }

    public g() {
        this.mFragments = new C3209ci0(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.l(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.savedstate.a.b() { // from class: Uh0
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return this.a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new InterfaceC3760fL() { // from class: Vh0
            @Override // defpackage.InterfaceC3760fL
            public final void a(Object obj) {
                this.a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC3760fL() { // from class: Wh0
            @Override // defpackage.InterfaceC3760fL
            public final void a(Object obj) {
                this.a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new W81() { // from class: Xh0
            @Override // defpackage.W81
            public final void a(ComponentActivity componentActivity) {
                this.a.lambda$init$3(componentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.a;
        aVar.h.b(aVar, aVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, androidx.lifecycle.g.b bVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), bVar);
                }
                C2073Ti0 c2073Ti0 = fragment.mViewLifecycleOwner;
                androidx.lifecycle.g.b bVar2 = androidx.lifecycle.g.b.h;
                if (c2073Ti0 != null) {
                    c2073Ti0.b();
                    if (c2073Ti0.h.d.b(bVar2)) {
                        fragment.mViewLifecycleOwner.h.h(bVar);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.b(bVar2)) {
                    fragment.mLifecycleRegistry.h(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.h.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC6769tR0.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.a.h.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.h;
    }

    @NonNull
    @Deprecated
    public AbstractC6769tR0 getSupportLoaderManager() {
        return AbstractC6769tR0.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.g.b.g)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, defpackage.ActivityC2686aH, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_CREATE);
        C6828ti0 c6828ti0 = this.mFragments.a.h;
        c6828ti0.G = false;
        c6828ti0.H = false;
        c6828ti0.N.i = false;
        c6828ti0.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.h.k();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.h.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.h.t(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.h.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_RESUME);
        C6828ti0 c6828ti0 = this.mFragments.a.h;
        c6828ti0.G = false;
        c6828ti0.H = false;
        c6828ti0.N.i = false;
        c6828ti0.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C6828ti0 c6828ti0 = this.mFragments.a.h;
            c6828ti0.G = false;
            c6828ti0.H = false;
            c6828ti0.N.i = false;
            c6828ti0.t(4);
        }
        this.mFragments.a.h.x(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_START);
        C6828ti0 c6828ti1 = this.mFragments.a.h;
        c6828ti1.G = false;
        c6828ti1.H = false;
        c6828ti1.N.i = false;
        c6828ti1.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C6828ti0 c6828ti0 = this.mFragments.a.h;
        c6828ti0.H = true;
        c6828ti0.N.i = true;
        c6828ti0.t(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.g.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(AbstractC5700oK1 abstractC5700oK1) {
        Y6.a.c(this, abstractC5700oK1 != null ? new Y6.f(abstractC5700oK1) : null);
    }

    public void setExitSharedElementCallback(AbstractC5700oK1 abstractC5700oK1) {
        Y6.a.d(this, abstractC5700oK1 != null ? new Y6.f(abstractC5700oK1) : null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        Y6.a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        Y6.a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        Y6.a.e(this);
    }

    @Override // Y6.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public g(int i) {
        super(i);
        this.mFragments = new C3209ci0(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.l(this);
        this.mStopped = true;
        init();
    }
}
