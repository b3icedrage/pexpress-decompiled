package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import defpackage.AbstractC3000bi0;
import defpackage.AbstractC4726ji0;
import defpackage.AbstractC5023l7;
import defpackage.AbstractC6705t7;
import defpackage.C1039Gc0;
import defpackage.C1057Gi0;
import defpackage.C1332Jw;
import defpackage.C4603j7;
import defpackage.C4961kp;
import defpackage.C5446n7;
import defpackage.C5491nL;
import defpackage.C5779oi0;
import defpackage.C5807oq;
import defpackage.C5866p7;
import defpackage.C5989pi0;
import defpackage.C6199qi0;
import defpackage.C6408ri0;
import defpackage.C6982uS0;
import defpackage.C7335w7;
import defpackage.FP0;
import defpackage.InterfaceC3096c91;
import defpackage.InterfaceC3174cZ0;
import defpackage.InterfaceC3725f91;
import defpackage.InterfaceC3760fL;
import defpackage.InterfaceC4813k7;
import defpackage.InterfaceC5324mZ0;
import defpackage.InterfaceC5666o91;
import defpackage.InterfaceC5831oy;
import defpackage.InterfaceC5922pO1;
import defpackage.InterfaceC7038ui0;
import defpackage.InterfaceC7546x7;
import defpackage.L81;
import defpackage.OC1;
import defpackage.Q81;
import defpackage.RB0;
import defpackage.U81;
import defpackage.Wd2;
import defpackage.Z0;
import io.sentry.android.core.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public C7335w7 B;
    public C7335w7 C;
    public C7335w7 D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<androidx.fragment.app.a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public androidx.fragment.app.m N;
    public boolean b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public OnBackPressedDispatcher g;
    public AbstractC4726ji0<?> u;
    public AbstractC3000bi0 v;
    public Fragment w;
    public Fragment x;
    public final ArrayList<m> a = new ArrayList<>();
    public final p c = new p();
    public final androidx.fragment.app.j f = new androidx.fragment.app.j(this);
    public final b h = new b();
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, C4961kp> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> l = Collections.synchronizedMap(new HashMap());
    public final androidx.fragment.app.k m = new androidx.fragment.app.k(this);
    public final CopyOnWriteArrayList<InterfaceC7038ui0> n = new CopyOnWriteArrayList<>();
    public final C5779oi0 o = new InterfaceC3760fL() { // from class: oi0
        @Override // defpackage.InterfaceC3760fL
        public final void a(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.I()) {
                fragmentManager.h(false, configuration);
            }
        }
    };
    public final C5989pi0 p = new InterfaceC3760fL() { // from class: pi0
        @Override // defpackage.InterfaceC3760fL
        public final void a(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.I() && num.intValue() == 80) {
                fragmentManager.l(false);
            }
        }
    };
    public final C6199qi0 q = new InterfaceC3760fL() { // from class: qi0
        @Override // defpackage.InterfaceC3760fL
        public final void a(Object obj) {
            K11 k11 = (K11) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.I()) {
                fragmentManager.m(k11.a, false);
            }
        }
    };
    public final C6408ri0 r = new InterfaceC3760fL() { // from class: ri0
        @Override // defpackage.InterfaceC3760fL
        public final void a(Object obj) {
            C0809Dd1 c0809Dd1 = (C0809Dd1) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.I()) {
                fragmentManager.r(c0809Dd1.a, false);
            }
        }
    };
    public final c s = new c();
    public int t = -1;
    public androidx.fragment.app.i y = null;
    public final d z = new d();
    public final e A = new e();
    public ArrayDeque<l> E = new ArrayDeque<>();
    public final f O = new f();

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$6, reason: invalid class name */
    class AnonymousClass6 implements androidx.lifecycle.k {
        @Override // androidx.lifecycle.k
        public final void b(@NonNull FP0 fp0, @NonNull androidx.lifecycle.g.a aVar) {
            if (aVar == androidx.lifecycle.g.a.ON_START || aVar == androidx.lifecycle.g.a.ON_DESTROY) {
                throw null;
            }
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }
    }

    public class a implements InterfaceC4813k7<Map<String, Boolean>> {
        public a() {
        }

        @Override // defpackage.InterfaceC4813k7
        @SuppressLint({"SyntheticAccessor"})
        public final void b(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            l lVarPollFirst = fragmentManager.E.pollFirst();
            if (lVarPollFirst == null) {
                b0.e("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            p pVar = fragmentManager.c;
            String str = lVarPollFirst.d;
            Fragment fragmentC = pVar.c(str);
            if (fragmentC != null) {
                fragmentC.onRequestPermissionsResult(lVarPollFirst.e, strArr, iArr);
                return;
            }
            b0.e("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends L81 {
        public b() {
            super(false);
        }

        @Override // defpackage.L81
        public final void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.x(true);
            if (fragmentManager.h.a) {
                fragmentManager.N();
            } else {
                fragmentManager.g.c();
            }
        }
    }

    public class c implements InterfaceC5324mZ0 {
        public c() {
        }

        @Override // defpackage.InterfaceC5324mZ0
        public final boolean a(@NonNull MenuItem menuItem) {
            return FragmentManager.this.o(menuItem);
        }

        @Override // defpackage.InterfaceC5324mZ0
        public final void b(@NonNull Menu menu) {
            FragmentManager.this.p(menu);
        }

        @Override // defpackage.InterfaceC5324mZ0
        public final void c(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
            FragmentManager.this.j(menu, menuInflater);
        }

        @Override // defpackage.InterfaceC5324mZ0
        public final void d(@NonNull Menu menu) {
            FragmentManager.this.s(menu);
        }
    }

    public class d extends androidx.fragment.app.i {
        public d() {
        }

        @Override // androidx.fragment.app.i
        @NonNull
        public final Fragment a(@NonNull ClassLoader classLoader, @NonNull String str) {
            return Fragment.instantiate(FragmentManager.this.u.e, str, null);
        }
    }

    public class e implements InterfaceC5922pO1 {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.x(true);
        }
    }

    public class g implements InterfaceC7038ui0 {
        public final /* synthetic */ Fragment d;

        public g(Fragment fragment) {
            this.d = fragment;
        }

        @Override // defpackage.InterfaceC7038ui0
        public final void a(@NonNull Fragment fragment) {
            this.d.onAttachFragment(fragment);
        }
    }

    public class h implements InterfaceC4813k7<C4603j7> {
        public h() {
        }

        @Override // defpackage.InterfaceC4813k7
        public final void b(C4603j7 c4603j7) {
            C4603j7 c4603j8 = c4603j7;
            FragmentManager fragmentManager = FragmentManager.this;
            l lVarPollLast = fragmentManager.E.pollLast();
            if (lVarPollLast == null) {
                b0.e("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            p pVar = fragmentManager.c;
            String str = lVarPollLast.d;
            Fragment fragmentC = pVar.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(lVarPollLast.e, c4603j8.d, c4603j8.e);
            } else {
                b0.e("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            }
        }
    }

    public class i implements InterfaceC4813k7<C4603j7> {
        public i() {
        }

        @Override // defpackage.InterfaceC4813k7
        public final void b(C4603j7 c4603j7) {
            C4603j7 c4603j8 = c4603j7;
            FragmentManager fragmentManager = FragmentManager.this;
            l lVarPollFirst = fragmentManager.E.pollFirst();
            if (lVarPollFirst == null) {
                b0.e("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            p pVar = fragmentManager.c;
            String str = lVarPollFirst.d;
            Fragment fragmentC = pVar.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(lVarPollFirst.e, c4603j8.d, c4603j8.e);
            } else {
                b0.e("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            }
        }
    }

    public interface j {
        String getName();
    }

    public static class k extends AbstractC5023l7<RB0, C4603j7> {
        @Override // defpackage.AbstractC5023l7
        @NonNull
        public final Intent a(@NonNull Context context, RB0 rb0) {
            Bundle bundleExtra;
            RB0 rb1 = rb0;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = rb1.e;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = rb1.d;
                    Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                    rb1 = new RB0(intentSender, null, rb1.g, rb1.h);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", rb1);
            if (FragmentManager.G(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // defpackage.AbstractC5023l7
        @NonNull
        public final C4603j7 c(int i, Intent intent) {
            return new C4603j7(i, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();
        public String d;
        public int e;

        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                l lVar = new l();
                lVar.d = parcel.readString();
                lVar.e = parcel.readInt();
                return lVar;
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i) {
                return new l[i];
            }
        }

        public l(@NonNull String str, int i) {
            this.d = str;
            this.e = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }
    }

    public interface m {
        boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class n implements m {
        public final String a;
        public final int b;
        public final int c;

        public n(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.x;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().O(-1, 0)) {
                return FragmentManager.this.P(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    public static boolean G(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean H(@NonNull Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zH = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.c.e()) {
            if (fragment2 != null) {
                zH = H(fragment2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.x) && J(fragmentManager.w);
    }

    public final Fragment A(int i2) {
        p pVar = this.c;
        ArrayList<Fragment> arrayList = pVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (o oVar : pVar.b.values()) {
            if (oVar != null) {
                Fragment fragment2 = oVar.c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment B(String str) {
        p pVar = this.c;
        if (str != null) {
            ArrayList<Fragment> arrayList = pVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            pVar.getClass();
            return null;
        }
        for (o oVar : pVar.b.values()) {
            if (oVar != null) {
                Fragment fragment2 = oVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void C() {
        for (s sVar : e()) {
            if (sVar.e) {
                G(2);
                sVar.e = false;
                sVar.c();
            }
        }
    }

    public final ViewGroup D(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.v.c()) {
            return null;
        }
        View viewB = this.v.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    @NonNull
    public final androidx.fragment.app.i E() {
        androidx.fragment.app.i iVar = this.y;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.w;
        return fragment != null ? fragment.mFragmentManager.E() : this.z;
    }

    @NonNull
    public final InterfaceC5922pO1 F() {
        Fragment fragment = this.w;
        return fragment != null ? fragment.mFragmentManager.F() : this.A;
    }

    public final boolean I() {
        Fragment fragment = this.w;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.w.getParentFragmentManager().I();
    }

    public final boolean K() {
        return this.G || this.H;
    }

    public final void L(int i2, boolean z) {
        HashMap<String, o> map;
        AbstractC4726ji0<?> abstractC4726ji0;
        if (this.u == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.t) {
            this.t = i2;
            p pVar = this.c;
            Iterator<Fragment> it = pVar.a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = pVar.b;
                if (!zHasNext) {
                    break;
                }
                o oVar = map.get(it.next().mWho);
                if (oVar != null) {
                    oVar.i();
                }
            }
            for (o oVar2 : map.values()) {
                if (oVar2 != null) {
                    oVar2.i();
                    Fragment fragment = oVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !pVar.c.containsKey(fragment.mWho)) {
                            pVar.i(fragment.mWho, oVar2.l());
                        }
                        pVar.h(oVar2);
                    }
                }
            }
            for (o oVar3 : pVar.d()) {
                Fragment fragment2 = oVar3.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.J = true;
                    } else {
                        fragment2.mDeferStart = false;
                        oVar3.i();
                    }
                }
            }
            if (this.F && (abstractC4726ji0 = this.u) != null && this.t == 7) {
                abstractC4726ji0.h();
                this.F = false;
            }
        }
    }

    public final void M() {
        if (this.u == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.i = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean N() {
        return O(-1, 0);
    }

    public final boolean O(int i2, int i3) {
        x(false);
        w(true);
        Fragment fragment = this.x;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().N()) {
            return true;
        }
        boolean zP = P(this.K, this.L, null, i2, i3);
        if (zP) {
            this.b = true;
            try {
                T(this.K, this.L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        e0();
        boolean z = this.J;
        p pVar = this.c;
        if (z) {
            this.J = false;
            for (o oVar : pVar.d()) {
                Fragment fragment2 = oVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.J = true;
                    } else {
                        fragment2.mDeferStart = false;
                        oVar.i();
                    }
                }
            }
        }
        pVar.b.values().removeAll(Collections.singleton(null));
        return zP;
    }

    public final boolean P(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        boolean z = (i3 & 1) != 0;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (str != null || i2 >= 0) {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        androidx.fragment.app.a aVar2 = this.d.get(size - 1);
                        if ((str == null || !str.equals(aVar2.i)) && (i2 < 0 || i2 != aVar2.s)) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            } else {
                size = z ? 0 : this.d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Q(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            c0(new IllegalStateException(C1332Jw.b("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void R(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.m.a.add(new androidx.fragment.app.k.a(fragmentLifecycleCallbacks, z));
    }

    public final void S(@NonNull Fragment fragment) {
        if (G(2)) {
            Objects.toString(fragment);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        p pVar = this.c;
        synchronized (pVar.a) {
            pVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (H(fragment)) {
            this.F = true;
        }
        fragment.mRemoving = true;
        b0(fragment);
    }

    public final void T(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    z(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                z(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            z(arrayList, arrayList2, i3, size);
        }
    }

    public final void U(Bundle bundle) {
        androidx.fragment.app.k kVar;
        o oVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.u.e.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.u.e.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        p pVar = this.c;
        HashMap<String, Bundle> map2 = pVar.c;
        map2.clear();
        map2.putAll(map);
        androidx.fragment.app.l lVar = (androidx.fragment.app.l) bundle.getParcelable("state");
        if (lVar == null) {
            return;
        }
        HashMap<String, o> map3 = pVar.b;
        map3.clear();
        Iterator<String> it = lVar.d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kVar = this.m;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = pVar.i(it.next(), null);
            if (bundleI != null) {
                Fragment fragment = this.N.d.get(((androidx.fragment.app.n) bundleI.getParcelable("state")).e);
                if (fragment != null) {
                    if (G(2)) {
                        fragment.toString();
                    }
                    oVar = new o(kVar, pVar, fragment, bundleI);
                } else {
                    oVar = new o(this.m, this.c, this.u.e.getClassLoader(), E(), bundleI);
                }
                Fragment fragment2 = oVar.c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (G(2)) {
                    fragment2.toString();
                }
                oVar.j(this.u.e.getClassLoader());
                pVar.g(oVar);
                oVar.e = this.t;
            }
        }
        androidx.fragment.app.m mVar = this.N;
        mVar.getClass();
        for (Fragment fragment3 : new ArrayList(mVar.d.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (G(2)) {
                    fragment3.toString();
                    Objects.toString(lVar.d);
                }
                this.N.l(fragment3);
                fragment3.mFragmentManager = this;
                o oVar2 = new o(kVar, pVar, fragment3);
                oVar2.e = 1;
                oVar2.i();
                fragment3.mRemoving = true;
                oVar2.i();
            }
        }
        ArrayList<String> arrayList = lVar.e;
        pVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = pVar.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(C1039Gc0.d("No instantiated fragment for (", str3, ")"));
                }
                if (G(2)) {
                    fragmentB.toString();
                }
                pVar.a(fragmentB);
            }
        }
        if (lVar.g != null) {
            this.d = new ArrayList<>(lVar.g.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = lVar.g;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i2];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = bVar.d;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    q.a aVar2 = new q.a();
                    int i5 = i3 + 1;
                    aVar2.a = iArr[i3];
                    if (G(2)) {
                        Objects.toString(aVar);
                        int i6 = iArr[i5];
                    }
                    aVar2.h = androidx.lifecycle.g.b.values()[bVar.g[i4]];
                    aVar2.i = androidx.lifecycle.g.b.values()[bVar.h[i4]];
                    int i7 = i3 + 2;
                    aVar2.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    aVar2.d = i8;
                    int i9 = iArr[i3 + 3];
                    aVar2.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    aVar2.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    aVar2.g = i12;
                    aVar.b = i8;
                    aVar.c = i9;
                    aVar.d = i11;
                    aVar.e = i12;
                    aVar.b(aVar2);
                    i4++;
                }
                aVar.f = bVar.i;
                aVar.i = bVar.j;
                aVar.g = true;
                aVar.j = bVar.l;
                aVar.k = bVar.m;
                aVar.l = bVar.n;
                aVar.m = bVar.o;
                aVar.n = bVar.p;
                aVar.o = bVar.q;
                aVar.p = bVar.r;
                aVar.s = bVar.k;
                int i13 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = bVar.e;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i13);
                    if (str4 != null) {
                        aVar.a.get(i13).b = pVar.b(str4);
                    }
                    i13++;
                }
                aVar.d(1);
                if (G(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new C6982uS0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(lVar.h);
        String str5 = lVar.i;
        if (str5 != null) {
            Fragment fragmentB2 = pVar.b(str5);
            this.x = fragmentB2;
            q(fragmentB2);
        }
        ArrayList<String> arrayList3 = lVar.j;
        if (arrayList3 != null) {
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                this.j.put(arrayList3.get(i14), lVar.k.get(i14));
            }
        }
        this.E = new ArrayDeque<>(lVar.l);
    }

    @NonNull
    public final Bundle V() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        C();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((s) it.next()).e();
        }
        x(true);
        this.G = true;
        this.N.i = true;
        p pVar = this.c;
        pVar.getClass();
        HashMap<String, o> map = pVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (o oVar : map.values()) {
            if (oVar != null) {
                Fragment fragment = oVar.c;
                pVar.i(fragment.mWho, oVar.l());
                arrayList2.add(fragment.mWho);
                if (G(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.c.c;
        if (map2.isEmpty()) {
            G(2);
            return bundle;
        }
        p pVar2 = this.c;
        synchronized (pVar2.a) {
            try {
                bVarArr = null;
                if (pVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(pVar2.a.size());
                    for (Fragment fragment2 : pVar2.a) {
                        arrayList.add(fragment2.mWho);
                        if (G(2)) {
                            fragment2.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.d.get(i2));
                if (G(2)) {
                    Objects.toString(this.d.get(i2));
                }
            }
        }
        androidx.fragment.app.l lVar = new androidx.fragment.app.l();
        lVar.d = arrayList2;
        lVar.e = arrayList;
        lVar.g = bVarArr;
        lVar.h = this.i.get();
        Fragment fragment3 = this.x;
        if (fragment3 != null) {
            lVar.i = fragment3.mWho;
        }
        lVar.j.addAll(this.j.keySet());
        lVar.k.addAll(this.j.values());
        lVar.l = new ArrayList<>(this.E);
        bundle.putParcelable("state", lVar);
        for (String str : this.k.keySet()) {
            bundle.putBundle(C5491nL.c("result_", str), this.k.get(str));
        }
        for (String str2 : map2.keySet()) {
            bundle.putBundle(C5491nL.c("fragment_", str2), map2.get(str2));
        }
        return bundle;
    }

    public final Fragment.m W(@NonNull Fragment fragment) {
        o oVar = this.c.b.get(fragment.mWho);
        if (oVar != null) {
            Fragment fragment2 = oVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.m(oVar.l());
                }
                return null;
            }
        }
        c0(new IllegalStateException(C1332Jw.b("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void X() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.u.g.removeCallbacks(this.O);
                    this.u.g.post(this.O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(@NonNull Fragment fragment, boolean z) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD == null || !(viewGroupD instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupD).setDrawDisappearingViewsLast(!z);
    }

    public final void Z(@NonNull Fragment fragment, @NonNull androidx.lifecycle.g.b bVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final o a(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C1057Gi0.c(fragment, str);
        }
        if (G(2)) {
            fragment.toString();
        }
        o oVarF = f(fragment);
        fragment.mFragmentManager = this;
        p pVar = this.c;
        pVar.g(oVarF);
        if (!fragment.mDetached) {
            pVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H(fragment)) {
                this.F = true;
            }
        }
        return oVarF;
    }

    public final void a0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.x;
        this.x = fragment;
        q(fragment2);
        q(this.x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@NonNull AbstractC4726ji0<?> abstractC4726ji0, @NonNull AbstractC3000bi0 abstractC3000bi0, Fragment fragment) {
        if (this.u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.u = abstractC4726ji0;
        this.v = abstractC3000bi0;
        this.w = fragment;
        CopyOnWriteArrayList<InterfaceC7038ui0> copyOnWriteArrayList = this.n;
        if (fragment != null) {
            copyOnWriteArrayList.add(new g(fragment));
        } else if (abstractC4726ji0 instanceof InterfaceC7038ui0) {
            copyOnWriteArrayList.add((InterfaceC7038ui0) abstractC4726ji0);
        }
        if (this.w != null) {
            e0();
        }
        if (abstractC4726ji0 instanceof Q81) {
            Q81 q81 = (Q81) abstractC4726ji0;
            OnBackPressedDispatcher onBackPressedDispatcher = q81.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            FP0 fp0 = q81;
            if (fragment != null) {
                fp0 = fragment;
            }
            onBackPressedDispatcher.a(fp0, this.h);
        }
        if (fragment != null) {
            androidx.fragment.app.m mVar = fragment.mFragmentManager.N;
            HashMap<String, androidx.fragment.app.m> map = mVar.e;
            androidx.fragment.app.m mVar2 = map.get(fragment.mWho);
            if (mVar2 == null) {
                mVar2 = new androidx.fragment.app.m(mVar.g);
                map.put(fragment.mWho, mVar2);
            }
            this.N = mVar2;
        } else if (abstractC4726ji0 instanceof Wd2) {
            this.N = (androidx.fragment.app.m) new x(((Wd2) abstractC4726ji0).getViewModelStore(), androidx.fragment.app.m.j).a(androidx.fragment.app.m.class);
        } else {
            this.N = new androidx.fragment.app.m(false);
        }
        this.N.i = K();
        this.c.d = this.N;
        Object obj = this.u;
        if ((obj instanceof OC1) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((OC1) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new androidx.savedstate.a.b() { // from class: si0
                @Override // androidx.savedstate.a.b
                public final Bundle a() {
                    return this.a.V();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        Object obj2 = this.u;
        if (obj2 instanceof InterfaceC7546x7) {
            AbstractC6705t7 activityResultRegistry = ((InterfaceC7546x7) obj2).getActivityResultRegistry();
            String strC = C5491nL.c("FragmentManager:", fragment != null ? C5807oq.b(new StringBuilder(), fragment.mWho, ":") : "");
            this.B = activityResultRegistry.d(Z0.c(strC, "StartActivityForResult"), new C5866p7(), new h());
            this.C = activityResultRegistry.d(Z0.c(strC, "StartIntentSenderForResult"), new k(), new i());
            this.D = activityResultRegistry.d(Z0.c(strC, "RequestPermissions"), new C5446n7(), new a());
        }
        Object obj3 = this.u;
        if (obj3 instanceof U81) {
            ((U81) obj3).addOnConfigurationChangedListener(this.o);
        }
        Object obj4 = this.u;
        if (obj4 instanceof InterfaceC5666o91) {
            ((InterfaceC5666o91) obj4).addOnTrimMemoryListener(this.p);
        }
        Object obj5 = this.u;
        if (obj5 instanceof InterfaceC3096c91) {
            ((InterfaceC3096c91) obj5).addOnMultiWindowModeChangedListener(this.q);
        }
        Object obj6 = this.u;
        if (obj6 instanceof InterfaceC3725f91) {
            ((InterfaceC3725f91) obj6).addOnPictureInPictureModeChangedListener(this.r);
        }
        Object obj7 = this.u;
        if ((obj7 instanceof InterfaceC3174cZ0) && fragment == null) {
            ((InterfaceC3174cZ0) obj7).addMenuProvider(this.s);
        }
    }

    public final void b0(@NonNull Fragment fragment) {
        ViewGroup viewGroupD = D(fragment);
        if (viewGroupD != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupD.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupD.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupD.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void c(@NonNull Fragment fragment) {
        if (G(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (G(2)) {
                fragment.toString();
            }
            if (H(fragment)) {
                this.F = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        b0.c("FragmentManager", illegalStateException.getMessage());
        b0.c("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C6982uS0());
        AbstractC4726ji0<?> abstractC4726ji0 = this.u;
        if (abstractC4726ji0 != null) {
            try {
                abstractC4726ji0.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                b0.d("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            b0.d("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        androidx.fragment.app.k kVar = this.m;
        synchronized (kVar.a) {
            try {
                int size = kVar.a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (kVar.a.get(i2).a == fragmentLifecycleCallbacks) {
                        kVar.a.remove(i2);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        Object dVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup container = ((o) it.next()).c.mContainer;
            if (container != null) {
                InterfaceC5922pO1 factory = F();
                Intrinsics.checkNotNullParameter(container, "container");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Object tag = container.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof s) {
                    dVar = (s) tag;
                } else {
                    ((e) factory).getClass();
                    Intrinsics.checkNotNullParameter(container, "container");
                    dVar = new androidx.fragment.app.d(container);
                    Intrinsics.checkNotNullExpressionValue(dVar, "factory.createController(container)");
                    container.setTag(R.id.special_effects_controller_view_tag, dVar);
                }
                hashSet.add(dVar);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ak0, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ak0, kotlin.jvm.functions.Function0] */
    public final void e0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    b bVar = this.h;
                    bVar.a = true;
                    ?? r1 = bVar.c;
                    if (r1 != 0) {
                        r1.invoke();
                    }
                    return;
                }
                b bVar2 = this.h;
                ArrayList<androidx.fragment.app.a> arrayList = this.d;
                bVar2.a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.w);
                ?? r0 = bVar2.c;
                if (r0 != 0) {
                    r0.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final o f(@NonNull Fragment fragment) {
        String str = fragment.mWho;
        p pVar = this.c;
        o oVar = pVar.b.get(str);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this.m, pVar, fragment);
        oVar2.j(this.u.e.getClassLoader());
        oVar2.e = this.t;
        return oVar2;
    }

    public final void g(@NonNull Fragment fragment) {
        if (G(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G(2)) {
                fragment.toString();
            }
            p pVar = this.c;
            synchronized (pVar.a) {
                pVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (H(fragment)) {
                this.F = true;
            }
            b0(fragment);
        }
    }

    public final void h(boolean z, @NonNull Configuration configuration) {
        if (z && (this.u instanceof U81)) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(@NonNull MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((s) it.next()).e();
        }
        AbstractC4726ji0<?> abstractC4726ji0 = this.u;
        boolean z = abstractC4726ji0 instanceof Wd2;
        p pVar = this.c;
        if (z) {
            zIsChangingConfigurations = pVar.d.h;
        } else {
            androidx.fragment.app.g gVar = abstractC4726ji0.e;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<C4961kp> it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().d) {
                    androidx.fragment.app.m mVar = pVar.d;
                    mVar.getClass();
                    G(3);
                    mVar.k(str);
                }
            }
        }
        t(-1);
        Object obj = this.u;
        if (obj instanceof InterfaceC5666o91) {
            ((InterfaceC5666o91) obj).removeOnTrimMemoryListener(this.p);
        }
        Object obj2 = this.u;
        if (obj2 instanceof U81) {
            ((U81) obj2).removeOnConfigurationChangedListener(this.o);
        }
        Object obj3 = this.u;
        if (obj3 instanceof InterfaceC3096c91) {
            ((InterfaceC3096c91) obj3).removeOnMultiWindowModeChangedListener(this.q);
        }
        Object obj4 = this.u;
        if (obj4 instanceof InterfaceC3725f91) {
            ((InterfaceC3725f91) obj4).removeOnPictureInPictureModeChangedListener(this.r);
        }
        Object obj5 = this.u;
        if ((obj5 instanceof InterfaceC3174cZ0) && this.w == null) {
            ((InterfaceC3174cZ0) obj5).removeMenuProvider(this.s);
        }
        this.u = null;
        this.v = null;
        this.w = null;
        if (this.g != null) {
            Iterator<InterfaceC5831oy> it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
            this.g = null;
        }
        C7335w7 c7335w7 = this.B;
        if (c7335w7 != null) {
            c7335w7.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.u instanceof InterfaceC5666o91)) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.u instanceof InterfaceC3096c91)) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        for (Fragment fragment : this.c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(@NonNull MenuItem menuItem) {
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(@NonNull Menu menu) {
        if (this.t < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.u instanceof InterfaceC3725f91)) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(@NonNull Menu menu) {
        boolean z = false;
        if (this.t < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i2) {
        try {
            this.b = true;
            for (o oVar : this.c.b.values()) {
                if (oVar != null) {
                    oVar.e = i2;
                }
            }
            L(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((s) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.w;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.w)));
            sb.append("}");
        } else {
            AbstractC4726ji0<?> abstractC4726ji0 = this.u;
            if (abstractC4726ji0 != null) {
                sb.append(abstractC4726ji0.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.u)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strC = Z0.c(str, "    ");
        p pVar = this.c;
        pVar.getClass();
        String str2 = str + "    ";
        HashMap<String, o> map = pVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o oVar : map.values()) {
                printWriter.print(str);
                if (oVar != null) {
                    Fragment fragment = oVar.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = pVar.a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(strC, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (m) this.a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.v);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void v(@NonNull m mVar, boolean z) {
        if (!z) {
            if (this.u == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (K()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.u == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(mVar);
                    X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.u == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.u.g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && K()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.K == null) {
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.K;
            ArrayList<Boolean> arrayList2 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zA |= this.a.get(i2).a(arrayList, arrayList2);
                        }
                        this.a.clear();
                        this.u.g.removeCallbacks(this.O);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.u.g.removeCallbacks(this.O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                T(this.K, this.L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        e0();
        if (this.J) {
            this.J = false;
            for (o oVar : this.c.d()) {
                Fragment fragment = oVar.c;
                if (fragment.mDeferStart) {
                    if (this.b) {
                        this.J = true;
                    } else {
                        fragment.mDeferStart = false;
                        oVar.i();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void y(@NonNull androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.u == null || this.I)) {
            return;
        }
        w(z);
        aVar.a(this.K, this.L);
        this.b = true;
        try {
            T(this.K, this.L);
            d();
            e0();
            boolean z2 = this.J;
            p pVar = this.c;
            if (z2) {
                this.J = false;
                for (o oVar : pVar.d()) {
                    Fragment fragment = oVar.c;
                    if (fragment.mDeferStart) {
                        if (this.b) {
                            this.J = true;
                        } else {
                            fragment.mDeferStart = false;
                            oVar.i();
                        }
                    }
                }
            }
            pVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x022e A[PHI: r13
      0x022e: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:100:0x021e, B:105:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:65:0x0188  */
    public final void z(@NonNull ArrayList<androidx.fragment.app.a> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4 = arrayList.get(i2).p;
        ArrayList<Fragment> arrayList3 = this.M;
        if (arrayList3 == null) {
            this.M = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<Fragment> arrayList4 = this.M;
        p pVar = this.c;
        arrayList4.addAll(pVar.f());
        Fragment fragment = this.x;
        int i8 = i2;
        boolean z5 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i3) {
                boolean z6 = z4;
                this.M.clear();
                if (!z6 && this.t >= 1) {
                    for (int i10 = i2; i10 < i3; i10++) {
                        Iterator<q.a> it = arrayList.get(i10).a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                pVar.g(f(fragment2));
                            }
                        }
                    }
                }
                for (int i11 = i2; i11 < i3; i11++) {
                    androidx.fragment.app.a aVar = arrayList.get(i11);
                    if (arrayList2.get(i11).booleanValue()) {
                        aVar.d(-1);
                        ArrayList<q.a> arrayList5 = aVar.a;
                        boolean z7 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            q.a aVar2 = arrayList5.get(size);
                            Fragment fragment3 = aVar2.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z7);
                                int i12 = aVar.f;
                                int i13 = 8194;
                                int i14 = 4097;
                                if (i12 != 4097) {
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        i14 = 8197;
                                        if (i12 != 8197) {
                                            if (i12 == 4099) {
                                                i13 = 4099;
                                            } else if (i12 != 4100) {
                                                i13 = 0;
                                            } else {
                                                i13 = i14;
                                            }
                                        }
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                fragment3.setNextTransition(i13);
                                fragment3.setSharedElementNames(aVar.o, aVar.n);
                            }
                            int i15 = aVar2.a;
                            FragmentManager fragmentManager = aVar.q;
                            switch (i15) {
                                case 1:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    z7 = true;
                                    fragmentManager.Y(fragment3, true);
                                    fragmentManager.S(fragment3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.a);
                                case 3:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.a(fragment3);
                                    z7 = true;
                                    break;
                                case 4:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.getClass();
                                    if (G(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    z7 = true;
                                    break;
                                case 5:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.Y(fragment3, true);
                                    if (G(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        fragmentManager.b0(fragment3);
                                    }
                                    z7 = true;
                                    break;
                                case 6:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.c(fragment3);
                                    z7 = true;
                                    break;
                                case 7:
                                    fragment3.setAnimations(aVar2.d, aVar2.e, aVar2.f, aVar2.g);
                                    fragmentManager.Y(fragment3, true);
                                    fragmentManager.g(fragment3);
                                    z7 = true;
                                    break;
                                case 8:
                                    fragmentManager.a0(null);
                                    z7 = true;
                                    break;
                                case 9:
                                    fragmentManager.a0(fragment3);
                                    z7 = true;
                                    break;
                                case 10:
                                    fragmentManager.Z(fragment3, aVar2.h);
                                    z7 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar.d(1);
                        ArrayList<q.a> arrayList6 = aVar.a;
                        int size2 = arrayList6.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            q.a aVar3 = arrayList6.get(i16);
                            Fragment fragment4 = aVar3.b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(aVar.f);
                                fragment4.setSharedElementNames(aVar.n, aVar.o);
                            }
                            int i17 = aVar3.a;
                            FragmentManager fragmentManager2 = aVar.q;
                            switch (i17) {
                                case 1:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.Y(fragment4, false);
                                    fragmentManager2.a(fragment4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar3.a);
                                case 3:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.S(fragment4);
                                    break;
                                case 4:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.getClass();
                                    if (G(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (!fragment4.mHidden) {
                                        fragment4.mHidden = true;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                        fragmentManager2.b0(fragment4);
                                    }
                                    break;
                                case 5:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.Y(fragment4, false);
                                    if (G(2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (fragment4.mHidden) {
                                        fragment4.mHidden = false;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    }
                                    break;
                                case 6:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.g(fragment4);
                                    break;
                                case 7:
                                    fragment4.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager2.Y(fragment4, false);
                                    fragmentManager2.c(fragment4);
                                    break;
                                case 8:
                                    fragmentManager2.a0(fragment4);
                                    break;
                                case 9:
                                    fragmentManager2.a0(null);
                                    break;
                                case 10:
                                    fragmentManager2.Z(fragment4, aVar3.i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i18 = i2; i18 < i3; i18++) {
                    androidx.fragment.app.a aVar4 = arrayList.get(i18);
                    if (zBooleanValue) {
                        for (int size3 = aVar4.a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment5 = aVar4.a.get(size3).b;
                            if (fragment5 != null) {
                                f(fragment5).i();
                            }
                        }
                    } else {
                        Iterator<q.a> it2 = aVar4.a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment6 = it2.next().b;
                            if (fragment6 != null) {
                                f(fragment6).i();
                            }
                        }
                    }
                }
                L(this.t, true);
                HashSet<s> hashSet = new HashSet();
                for (int i19 = i2; i19 < i3; i19++) {
                    Iterator<q.a> it3 = arrayList.get(i19).a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment7 = it3.next().b;
                        if (fragment7 != null && (viewGroup = fragment7.mContainer) != null) {
                            hashSet.add(s.f(viewGroup, this));
                        }
                    }
                }
                for (s sVar : hashSet) {
                    sVar.d = zBooleanValue;
                    sVar.g();
                    sVar.c();
                }
                for (int i20 = i2; i20 < i3; i20++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i20);
                    if (arrayList2.get(i20).booleanValue() && aVar5.s >= 0) {
                        aVar5.s = -1;
                    }
                    aVar5.getClass();
                }
                return;
            }
            androidx.fragment.app.a aVar6 = arrayList.get(i8);
            if (arrayList2.get(i8).booleanValue()) {
                z = z4;
                i4 = i8;
                z2 = z5;
                int i21 = 1;
                ArrayList<Fragment> arrayList7 = this.M;
                ArrayList<q.a> arrayList8 = aVar6.a;
                int size4 = arrayList8.size() - 1;
                while (size4 >= 0) {
                    q.a aVar7 = arrayList8.get(size4);
                    int i22 = aVar7.a;
                    if (i22 == i21) {
                        arrayList7.remove(aVar7.b);
                    } else if (i22 != 3) {
                        switch (i22) {
                            case 6:
                                arrayList7.add(aVar7.b);
                                break;
                            case 7:
                                arrayList7.remove(aVar7.b);
                                break;
                            case 8:
                                fragment = null;
                                break;
                            case 9:
                                fragment = aVar7.b;
                                break;
                            case 10:
                                aVar7.i = aVar7.h;
                                break;
                        }
                    } else {
                        arrayList7.add(aVar7.b);
                    }
                    size4--;
                    i21 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList9 = this.M;
                int i23 = 0;
                while (true) {
                    ArrayList<q.a> arrayList10 = aVar6.a;
                    if (i23 < arrayList10.size()) {
                        q.a aVar8 = arrayList10.get(i23);
                        int i24 = aVar8.a;
                        if (i24 != i9) {
                            if (i24 != 2) {
                                if (i24 == 3 || i24 == 6) {
                                    z4 = z4;
                                    arrayList9.remove(aVar8.b);
                                    Fragment fragment8 = aVar8.b;
                                    if (fragment8 == fragment) {
                                        arrayList10.add(i23, new q.a(fragment8, 9));
                                        i23++;
                                        i6 = i8;
                                        z3 = z5;
                                        i5 = 1;
                                        fragment = null;
                                    }
                                } else if (i24 == 7) {
                                    i5 = 1;
                                } else if (i24 != 8) {
                                    z4 = z4;
                                } else {
                                    z4 = z4;
                                    arrayList10.add(i23, new q.a(fragment, 9, 0));
                                    aVar8.c = true;
                                    i23++;
                                    fragment = aVar8.b;
                                }
                                i6 = i8;
                                z3 = z5;
                                i5 = 1;
                            } else {
                                z4 = z4;
                                Fragment fragment9 = aVar8.b;
                                int i25 = fragment9.mContainerId;
                                int size5 = arrayList9.size() - 1;
                                boolean z8 = false;
                                while (size5 >= 0) {
                                    int i26 = i8;
                                    Fragment fragment10 = arrayList9.get(size5);
                                    boolean z9 = z5;
                                    if (fragment10.mContainerId != i25) {
                                        i25 = i25;
                                    } else if (fragment10 == fragment9) {
                                        i25 = i25;
                                        z8 = true;
                                    } else {
                                        if (fragment10 == fragment) {
                                            i7 = 0;
                                            arrayList10.add(i23, new q.a(fragment10, 9, 0));
                                            i23++;
                                            fragment = null;
                                        } else {
                                            i7 = 0;
                                        }
                                        q.a aVar9 = new q.a(fragment10, 3, i7);
                                        aVar9.d = aVar8.d;
                                        aVar9.f = aVar8.f;
                                        aVar9.e = aVar8.e;
                                        aVar9.g = aVar8.g;
                                        arrayList10.add(i23, aVar9);
                                        arrayList9.remove(fragment10);
                                        i23++;
                                        fragment = fragment;
                                    }
                                    size5--;
                                    i25 = i25;
                                    z5 = z9;
                                    i8 = i26;
                                }
                                i6 = i8;
                                z3 = z5;
                                i5 = 1;
                                if (z8) {
                                    arrayList10.remove(i23);
                                    i23--;
                                } else {
                                    aVar8.a = 1;
                                    aVar8.c = true;
                                    arrayList9.add(fragment9);
                                }
                            }
                            i23 += i5;
                            i9 = i5;
                            z4 = z4;
                            z5 = z3;
                            i8 = i6;
                        } else {
                            i5 = i9;
                        }
                        i6 = i8;
                        z3 = z5;
                        arrayList9.add(aVar8.b);
                        i23 += i5;
                        i9 = i5;
                        z4 = z4;
                        z5 = z3;
                        i8 = i6;
                    } else {
                        z = z4;
                        i4 = i8;
                        z2 = z5;
                    }
                }
            }
            z5 = z2 || aVar6.g;
            i8 = i4 + 1;
            z4 = z;
        }
    }
}
