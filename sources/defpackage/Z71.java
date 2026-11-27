package defpackage;

import android.content.Intent;
import android.os.Build;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.n;
import androidx.fragment.app.g;
import androidx.fragment.app.i;
import com.api.core.BaseFragment;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z71 extends C0897Eh implements Y71 {

    @NotNull
    public final InterfaceC3560eO0<? extends InterfaceC3951gE1> f;

    @NotNull
    public final C4612j90 g;

    @NotNull
    public final C3296d7 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C1699On1 j;

    @Nullable
    public Fragment k;

    @NotNull
    public final ArrayList l;

    @NotNull
    public final LinkedHashMap m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("ADD", 0);
            d = aVar;
            a aVar2 = new a("ADD_WITH_HIDE", 1);
            e = aVar2;
            a aVar3 = new a("REPLACE", 2);
            g = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            h = aVarArr;
            C1952Ru.i(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z71(@NotNull InterfaceC3560eO0 screensApi, @NotNull g fragmentActivity, @NotNull C4612j90 eventsFlowsProvider, @NotNull C3296d7 activityOnBackPressedProvider) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(screensApi, "screensApi");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        this.f = screensApi;
        this.g = eventsFlowsProvider;
        this.h = activityOnBackPressedProvider;
        GP1 gp1I = C1589Ne.i("");
        this.i = gp1I;
        this.j = C4466ii.f(gp1I);
        this.l = new ArrayList();
        this.m = new LinkedHashMap();
    }

    public static void h(FragmentManager fragmentManager) {
        List<Fragment> listF = fragmentManager.c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        for (Fragment fragment : listF) {
            if (fragment instanceof DialogFragment) {
                ((DialogFragment) fragment).dismissAllowingStateLoss();
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            h(childFragmentManager);
        }
    }

    @Override // defpackage.Y71
    @NotNull
    public final C1699On1 a() {
        return this.j;
    }

    @Override // defpackage.Y71
    @Nullable
    public final C0667Bi0 b() {
        String canonicalName;
        Fragment fragment = this.k;
        if (fragment == null || (canonicalName = fragment.getClass().getCanonicalName()) == null) {
            return null;
        }
        return this.f.get().y(canonicalName);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x02ff  */
    /* JADX WARN: Type inference failed for: r15v19, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // defpackage.C0897Eh
    public final void c(@NotNull InterfaceC5263mF command) {
        List<BaseFragment.a> listI;
        List<Integer> list;
        String canonicalName;
        C0667Bi0 c0667Bi0Y;
        Iterable iterableE0;
        C0667Bi0 c0667Bi0B;
        String strA;
        Intrinsics.checkNotNullParameter(command, "command");
        boolean z = command instanceof C3090c8;
        Y81 y81 = Y81.a;
        ArrayList<String> arrayList = this.l;
        g gVar = this.b;
        if (z) {
            ((C3090c8) command).getClass();
            Intrinsics.c(null, "null cannot be cast to non-null type com.github.terrakok.cicerone.androidx.FragmentScreen");
            f(null, a.d);
        } else {
            boolean zA = Intrinsics.a(command, y81);
            FragmentManager fragmentManager = this.d;
            if (zA) {
                if (this.k instanceof DialogFragment) {
                    fragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                    Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
                    arrayList.remove(WE.e(arrayList));
                    j(aVar);
                    aVar.f();
                }
            } else if (Intrinsics.a(command, C4326i20.a)) {
                h(fragmentManager);
            } else if (Intrinsics.a(command, C3949gE.a)) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                gVar.startActivity(intent);
            } else {
                Intrinsics.d(command, "command");
                boolean z2 = command instanceof C1288Jh0;
                C5227m42.a aVar2 = C5227m42.a.REPLACE;
                if (z2) {
                    C1288Jh0 c1288Jh0 = (C1288Jh0) command;
                    AbstractC2307Wh abstractC2307Wh = c1288Jh0.a;
                    if (abstractC2307Wh == null) {
                        throw new C5865p62("null cannot be cast to non-null type com.github.terrakok.cicerone.androidx.AppScreen");
                    }
                    if (abstractC2307Wh instanceof C7756y7) {
                        throw null;
                    }
                    if (abstractC2307Wh instanceof C0589Ai0) {
                        if (!c1288Jh0.b) {
                            aVar2 = C5227m42.a.ADD;
                        }
                        g((C0589Ai0) abstractC2307Wh, aVar2);
                    }
                } else if (command instanceof C1789Pr1) {
                    C0667Bi0 c0667Bi0 = ((C1789Pr1) command).a;
                    if (c0667Bi0 == null) {
                        throw new C5865p62("null cannot be cast to non-null type com.github.terrakok.cicerone.androidx.AppScreen");
                    }
                    ArrayList arrayList2 = this.a;
                    if (arrayList2.isEmpty()) {
                        g(c0667Bi0, aVar2);
                    } else {
                        fragmentManager.getClass();
                        fragmentManager.v(fragmentManager.new n(null, -1, 0), false);
                        g(c0667Bi0, ((C5227m42) arrayList2.remove(WE.e(arrayList2))).b);
                    }
                } else if (command instanceof C5171lp) {
                    C5171lp command2 = (C5171lp) command;
                    Intrinsics.checkNotNullParameter(command2, "command");
                    C0667Bi0 c0667Bi1 = command2.a;
                    if (c0667Bi1 == null) {
                        if (this.k instanceof DialogFragment) {
                            ArrayList arrayList3 = new ArrayList();
                            for (String str : arrayList) {
                                Fragment fragmentB = fragmentManager.B(str);
                                DialogFragment dialogFragment = fragmentB instanceof DialogFragment ? (DialogFragment) fragmentB : null;
                                Pair pair = dialogFragment != null ? new Pair(str, dialogFragment) : null;
                                if (pair != null) {
                                    arrayList3.add(pair);
                                }
                            }
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((DialogFragment) ((Pair) it.next()).e).dismissAllowingStateLoss();
                            }
                            ArrayList arrayList4 = new ArrayList(XE.m(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add((String) ((Pair) it2.next()).d);
                            }
                            arrayList.removeAll(arrayList4);
                            String str2 = (String) CollectionsKt.N(arrayList);
                            this.k = str2 != null ? fragmentManager.B(str2) : null;
                        }
                        super.e(command2);
                    } else {
                        String str3 = c0667Bi1.b;
                        if (str3 != null) {
                            if (!arrayList.isEmpty()) {
                                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        iterableE0 = CollectionsKt.e0(arrayList);
                                        break;
                                    }
                                    if (Intrinsics.a((String) listIterator.previous(), str3)) {
                                        listIterator.next();
                                        int size = arrayList.size() - listIterator.nextIndex();
                                        if (size != 0) {
                                            ArrayList arrayList5 = new ArrayList(size);
                                            while (listIterator.hasNext()) {
                                                arrayList5.add(listIterator.next());
                                            }
                                            iterableE0 = arrayList5;
                                            break;
                                        }
                                        iterableE0 = C5653o60.d;
                                        break;
                                    }
                                }
                            } else {
                                iterableE0 = C5653o60.d;
                            }
                            ArrayList arrayList6 = new ArrayList(XE.m(iterableE0, 10));
                            Iterator it3 = iterableE0.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(fragmentManager.B((String) it3.next()));
                            }
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj : arrayList6) {
                                if (obj instanceof DialogFragment) {
                                    arrayList7.add(obj);
                                }
                            }
                            Iterator it4 = arrayList7.iterator();
                            while (it4.hasNext()) {
                                ((DialogFragment) it4.next()).dismiss();
                            }
                        }
                        super.e(command2);
                    }
                } else if (command instanceof C4532ip) {
                    Fragment fragment = this.k;
                    AbstractBottomSheetDialogFragment abstractBottomSheetDialogFragment = fragment instanceof AbstractBottomSheetDialogFragment ? (AbstractBottomSheetDialogFragment) fragment : null;
                    if (abstractBottomSheetDialogFragment != null) {
                        abstractBottomSheetDialogFragment.dismiss();
                    } else {
                        fragmentManager.getClass();
                        androidx.fragment.app.a fragmentTransaction = new androidx.fragment.app.a(fragmentManager);
                        Intrinsics.checkNotNullExpressionValue(fragmentTransaction, "beginTransaction(...)");
                        Fragment fragment2 = this.k;
                        C4701jc c4701jc = (C4701jc) this;
                        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
                        if (fragment2 == null || (canonicalName = fragment2.getClass().getCanonicalName()) == null || (c0667Bi0Y = c4701jc.n.get().y(canonicalName)) == null || !c0667Bi0Y.e) {
                            BaseFragment baseFragment = fragment2 instanceof BaseFragment ? (BaseFragment) fragment2 : null;
                            if (baseFragment != null && (listI = baseFragment.i()) != null) {
                                if (listI.contains(BaseFragment.a.d.a)) {
                                    list = c4701jc.s;
                                } else if (listI.contains(BaseFragment.a.C0265a.a)) {
                                    list = c4701jc.p;
                                } else {
                                    list = listI.contains(BaseFragment.a.c.a) ? c4701jc.t : c4701jc.q;
                                }
                                C3686f.p(fragmentTransaction, list);
                            }
                        }
                        if (arrayList.size() > 1) {
                            i(fragmentTransaction, false);
                            j(fragmentTransaction);
                            fragmentTransaction.f();
                        } else {
                            Intent intent2 = new Intent("android.intent.action.MAIN");
                            intent2.addCategory("android.intent.category.HOME");
                            intent2.setFlags(268435456);
                            gVar.startActivity(intent2);
                        }
                    }
                }
            }
        }
        command.toString();
        if (command instanceof C3090c8) {
            throw null;
        }
        if (command instanceof C1288Jh0) {
            strA = ((C1288Jh0) command).a.a();
        } else if (command instanceof C1789Pr1) {
            strA = ((C1789Pr1) command).a.b;
        } else if (command instanceof C5171lp) {
            C0667Bi0 c0667Bi2 = ((C5171lp) command).a;
            String str4 = c0667Bi2 != null ? c0667Bi2.b : null;
            if (str4 == null) {
                strA = "";
            } else {
                strA = str4;
            }
        } else if ((!(command instanceof C4532ip) && !command.equals(y81)) || (((c0667Bi0B = b()) == null || (strA = c0667Bi0B.b) == null) && (strA = (String) CollectionsKt.N(arrayList)) == null)) {
            strA = "";
        }
        this.i.setValue(strA);
        LinkedHashMap linkedHashMap = this.m;
        L81 l81 = (L81) linkedHashMap.get("default_callback");
        if (l81 == null) {
            OnBackPressedDispatcher onBackPressedDispatcher = gVar.getOnBackPressedDispatcher();
            C5984ph onBackPressed = new C5984ph(this, 3);
            Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
            Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
            P81 p81 = new P81(onBackPressed);
            onBackPressedDispatcher.a(gVar, p81);
            linkedHashMap.put("default_callback", p81);
            l81 = p81;
        }
        l81.a = this.h.a != null || arrayList.size() > 1 || Build.VERSION.SDK_INT < 31;
        ?? r15 = l81.c;
        if (r15 != 0) {
            r15.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(C0589Ai0 c0589Ai0, a aVar) {
        C0667Bi0 c0667Bi0Y;
        boolean z = c0589Ai0 instanceof C2854b10;
        ArrayList arrayList = this.l;
        C4612j90 c4612j90 = this.g;
        i fragmentFactory = this.e;
        FragmentManager fragmentManager = this.d;
        if (z) {
            String str = c0589Ai0.b;
            C2854b10 c2854b10 = (C2854b10) c0589Ai0;
            Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal == 2) {
                    throw new IllegalStateException("Replace command on dialog is not allowed. Try adding `clearContainer = false` to `navigateTo` method");
                }
                throw new C6489s51();
            }
            Fragment fragment = this.k;
            if (fragment != 0) {
                fragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction()");
                aVar2.j(fragment, androidx.lifecycle.g.b.h);
                aVar2.f();
                InterfaceC7271vo0 interfaceC7271vo0 = fragment instanceof InterfaceC7271vo0 ? (InterfaceC7271vo0) fragment : null;
                if (interfaceC7271vo0 != null) {
                    interfaceC7271vo0.d();
                }
            }
            AbstractBottomSheetDialogFragment abstractBottomSheetDialogFragment = c2854b10.d;
            if (abstractBottomSheetDialogFragment.isAdded()) {
                fragmentManager.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(fragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar3, "beginTransaction()");
                aVar3.k(abstractBottomSheetDialogFragment);
                aVar3.e(false);
            } else {
                abstractBottomSheetDialogFragment.showNow(fragmentManager, str);
            }
            arrayList.remove(c0589Ai0.b);
            arrayList.add(c0589Ai0.b);
            this.k = abstractBottomSheetDialogFragment;
            c4612j90.b(abstractBottomSheetDialogFragment);
            return;
        }
        if (this.k instanceof DialogFragment) {
            return;
        }
        Fragment fragmentInvoke = c0589Ai0.c.invoke(fragmentFactory);
        Intrinsics.c(fragmentInvoke, "null cannot be cast to non-null type com.api.core.BaseFragment");
        BaseFragment baseFragment = (BaseFragment) fragmentInvoke;
        fragmentManager.getClass();
        androidx.fragment.app.a fragmentTransaction = new androidx.fragment.app.a(fragmentManager);
        Intrinsics.checkNotNullExpressionValue(fragmentTransaction, "beginTransaction(...)");
        int i = this.c;
        Fragment fragmentA = fragmentManager.A(i);
        C4701jc c4701jc = (C4701jc) this;
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        String canonicalName = baseFragment.getClass().getCanonicalName();
        if (canonicalName == null || (c0667Bi0Y = c4701jc.n.get().y(canonicalName)) == null || !c0667Bi0Y.e) {
            if (fragmentA == null ? true : fragmentA instanceof BaseFragment) {
                boolean zContains = baseFragment.i().contains(BaseFragment.a.b.a);
                List<Integer> list = c4701jc.p;
                if (!zContains && (fragmentA == null || !((BaseFragment) fragmentA).i().contains(BaseFragment.a.C0265a.a))) {
                    if (baseFragment.i().contains(BaseFragment.a.c.a)) {
                        list = c4701jc.t;
                    } else {
                        List<BaseFragment.a> listI = baseFragment.i();
                        BaseFragment.a.d dVar = BaseFragment.a.d.a;
                        if (listI.contains(dVar)) {
                            list = c4701jc.r;
                        } else {
                            list = (fragmentA == null || !((BaseFragment) fragmentA).i().contains(dVar)) ? c4701jc.o : c4701jc.s;
                        }
                    }
                }
                C3686f.p(fragmentTransaction, list);
            }
        }
        int iOrdinal2 = aVar.ordinal();
        String str2 = c0589Ai0.b;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i(fragmentTransaction, true);
                if (baseFragment.isAdded()) {
                    fragmentTransaction.k(baseFragment);
                } else {
                    fragmentTransaction.c(i, baseFragment, str2, 1);
                }
            } else {
                if (iOrdinal2 != 2) {
                    throw new C6489s51();
                }
                if (i == 0) {
                    throw new IllegalArgumentException("Must use non-zero containerViewId");
                }
                fragmentTransaction.c(i, baseFragment, str2, 2);
                arrayList.clear();
            }
        } else if (baseFragment.isAdded()) {
            fragmentTransaction.k(baseFragment);
        } else {
            fragmentTransaction.c(i, baseFragment, str2, 1);
        }
        fragmentTransaction.j(baseFragment, androidx.lifecycle.g.b.i);
        arrayList.remove(str2);
        arrayList.add(str2);
        this.k = baseFragment;
        baseFragment.f();
        c4612j90.b(baseFragment);
        fragmentTransaction.e(false);
    }

    public final void g(@NotNull C0589Ai0 screen, @NotNull C5227m42.a type) {
        a aVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(type, "type");
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            aVar = a.e;
        } else {
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            aVar = a.g;
        }
        f(screen, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(androidx.fragment.app.a aVar, boolean z) {
        C0667Bi0 c0667Bi0B = b();
        Fragment fragment = this.k;
        if (fragment != 0) {
            if (z || (c0667Bi0B != null && c0667Bi0B.e)) {
                aVar.h(fragment);
                aVar.j(fragment, androidx.lifecycle.g.b.h);
            } else {
                if (fragment instanceof BaseFragment) {
                    this.f.get().t(fragment.getClass());
                }
                aVar.i(fragment);
            }
            if (fragment instanceof InterfaceC7271vo0) {
                ((InterfaceC7271vo0) fragment).d();
            }
        }
    }

    public final void j(androidx.fragment.app.a aVar) {
        Function1<i, Fragment> function1;
        ArrayList arrayList = this.l;
        Fragment fragmentB = this.d.B((String) CollectionsKt.N(arrayList));
        if (fragmentB == null) {
            C0667Bi0 c0667Bi0Y = this.f.get().y((String) CollectionsKt.L(arrayList));
            fragmentB = (c0667Bi0Y == null || (function1 = c0667Bi0Y.c) == null) ? null : function1.invoke(this.e);
        }
        this.k = fragmentB;
        if (fragmentB != null) {
            aVar.k(fragmentB);
            if (fragmentB instanceof InterfaceC7271vo0) {
                ((InterfaceC7271vo0) fragmentB).f();
            }
            this.g.b(fragmentB);
            aVar.j(fragmentB, androidx.lifecycle.g.b.i);
        }
    }
}
