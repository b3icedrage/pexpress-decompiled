package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.s;
import com.pexpress.tool.R;
import defpackage.AbstractC1605Ni0;
import defpackage.AbstractC5700oK1;
import defpackage.AbstractC6155qW0;
import defpackage.C1213Ii0;
import defpackage.C1291Ji0;
import defpackage.C2703aM1;
import defpackage.C2904bF;
import defpackage.C4213hW;
import defpackage.C5345me2;
import defpackage.C7300vy;
import defpackage.C8092zj;
import defpackage.Cd2;
import defpackage.EK;
import defpackage.Hd2;
import defpackage.K1;
import defpackage.RunnableC1524Mi0;
import defpackage.RunnableC2477Yd;
import defpackage.RunnableC3793fW;
import defpackage.RunnableC4003gW;
import defpackage.ViewTreeObserverOnPreDrawListenerC7556x91;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s {

    public static final class a extends b {
        public final boolean c;
        public boolean d;

        @Nullable
        public h.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull s.b operation, @NotNull C7300vy signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.c = z;
        }

        /* JADX WARN: Code duplicated, block: B:74:0x00fa A[Catch: RuntimeException -> 0x0100, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0100, blocks: (B:72:0x00f4, B:74:0x00fa), top: B:85:0x00f4 }] */
        @Nullable
        public final h.a c(@NotNull Context context) {
            int enterAnim;
            h.a aVar;
            Animator animatorLoadAnimator;
            int iA;
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.d) {
                return this.e;
            }
            s.b bVar = this.a;
            boolean z = bVar.a == s.b.EnumC0232b.e;
            Fragment fragment = bVar.c;
            int nextTransition = fragment.getNextTransition();
            if (this.c) {
                enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            h.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new h.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new h.a(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iA = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iA = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iA = z ? h.a(context, android.R.attr.activityCloseEnterAnimation) : h.a(context, android.R.attr.activityCloseExitAnimation);
                            } else if (nextTransition == 4099) {
                                iA = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iA = -1;
                            } else {
                                iA = z ? h.a(context, android.R.attr.activityOpenEnterAnimation) : h.a(context, android.R.attr.activityOpenExitAnimation);
                            }
                            enterAnim = iA;
                        }
                        if (enterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        aVar = new h.a(animationLoadAnimation);
                                        aVar2 = aVar;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                    try {
                                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                        if (animatorLoadAnimator != null) {
                                            aVar = new h.a(animatorLoadAnimator);
                                            aVar2 = aVar;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (zEquals) {
                                            throw e2;
                                        }
                                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                        if (animationLoadAnimation2 != null) {
                                            aVar2 = new h.a(animationLoadAnimation2);
                                        }
                                    }
                                }
                            } else {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    aVar = new h.a(animatorLoadAnimator);
                                    aVar2 = aVar;
                                }
                            }
                        }
                    }
                }
            }
            this.e = aVar2;
            this.d = true;
            return aVar2;
        }
    }

    public static class b {

        @NotNull
        public final s.b a;

        @NotNull
        public final C7300vy b;

        public b(@NotNull s.b operation, @NotNull C7300vy signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.a = operation;
            this.b = signal;
        }

        public final void a() {
            s.b bVar = this.a;
            C7300vy signal = this.b;
            Intrinsics.checkNotNullParameter(signal, "signal");
            LinkedHashSet linkedHashSet = bVar.e;
            if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            s.b bVar = this.a;
            View view = bVar.c.mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            s.b.EnumC0232b enumC0232b = s.b.EnumC0232b.e;
            s.b.EnumC0232b enumC0232b2 = s.b.EnumC0232b.h;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    enumC0232b2 = enumC0232b;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(EK.e(visibility, "Unknown visibility "));
                    }
                    enumC0232b2 = s.b.EnumC0232b.g;
                }
            }
            s.b.EnumC0232b enumC0232b3 = bVar.a;
            if (enumC0232b2 != enumC0232b3) {
                return (enumC0232b2 == enumC0232b || enumC0232b3 == enumC0232b) ? false : true;
            }
            return true;
        }
    }

    public static final class c extends b {

        @Nullable
        public final Object c;
        public final boolean d;

        @Nullable
        public final Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull s.b operation, @NotNull C7300vy signal, boolean z, boolean z2) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            s.b.EnumC0232b enumC0232b = operation.a;
            s.b.EnumC0232b enumC0232b2 = s.b.EnumC0232b.e;
            Fragment fragment = operation.c;
            this.c = enumC0232b == enumC0232b2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.d = operation.a == enumC0232b2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.e = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final AbstractC1605Ni0 c() {
            Object obj = this.c;
            AbstractC1605Ni0 abstractC1605Ni0D = d(obj);
            Object obj2 = this.e;
            AbstractC1605Ni0 abstractC1605Ni0D2 = d(obj2);
            if (abstractC1605Ni0D == null || abstractC1605Ni0D2 == null || abstractC1605Ni0D == abstractC1605Ni0D2) {
                return abstractC1605Ni0D == null ? abstractC1605Ni0D2 : abstractC1605Ni0D;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final AbstractC1605Ni0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            C1291Ji0 c1291Ji0 = C1213Ii0.a;
            if (c1291Ji0 != null && (obj instanceof Transition)) {
                return c1291Ji0;
            }
            AbstractC1605Ni0 abstractC1605Ni0 = C1213Ii0.b;
            if (abstractC1605Ni0 != null && abstractC1605Ni0.e(obj)) {
                return abstractC1605Ni0;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (Hd2.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                i(child, arrayList);
            }
        }
    }

    public static void j(C8092zj c8092zj, View view) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        String strK = Cd2.d.k(view);
        if (strK != null) {
            c8092zj.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    j(c8092zj, child);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:283:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:296:0x082d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0838  */
    /* JADX WARN: Code duplicated, block: B:301:0x083b  */
    /* JADX WARN: Code duplicated, block: B:304:0x0840  */
    /* JADX WARN: Code duplicated, block: B:307:0x0863  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:312:0x0881  */
    /* JADX WARN: Code duplicated, block: B:316:0x0893  */
    /* JADX WARN: Code duplicated, block: B:321:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:325:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:327:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:329:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:330:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:332:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:341:0x0904 A[LOOP:10: B:339:0x08fe->B:341:0x0904, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:344:0x0922  */
    /* JADX WARN: Code duplicated, block: B:380:0x0802 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x07fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x080f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0817 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x080b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0813 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0834 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0827 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x089a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x088d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x08a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x08f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x08ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    @Override // androidx.fragment.app.s
    public final void b(@NotNull ArrayList operations, final boolean z) {
        s.b.EnumC0232b enumC0232b;
        s.b.EnumC0232b enumC0232b2;
        s.b.EnumC0232b enumC0232b3;
        String str;
        Object next;
        Object objPrevious;
        ArrayList<a> arrayList;
        ArrayList<s.b> arrayList2;
        LinkedHashMap linkedHashMap;
        s.b.EnumC0232b enumC0232b4;
        s.b bVar;
        boolean z2;
        ArrayList arrayList3;
        C2703aM1 c2703aM1;
        int i;
        int i2;
        Object obj;
        ArrayList<View> arrayList4;
        s.b.EnumC0232b enumC0232b5;
        View view;
        C8092zj c8092zj;
        s.b.EnumC0232b enumC0232b6;
        ArrayList arrayList5;
        String str2;
        LinkedHashMap linkedHashMap2;
        Rect rect;
        ArrayList<String> arrayList6;
        AbstractC1605Ni0 abstractC1605Ni0;
        Object obj2;
        View view2;
        boolean zContainsValue;
        Context context;
        ArrayList<a> arrayList7;
        boolean z3;
        final s.b bVar2;
        Fragment fragment;
        final View view3;
        h.a aVarC;
        Animation animation;
        h.a aVarC2;
        final Animator animator;
        final s.b bVar3;
        boolean zA;
        Fragment fragment2;
        boolean z4;
        ArrayList arrayList8;
        s.b.EnumC0232b enumC0232b7;
        s.b.EnumC0232b enumC0232b8;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator it = operations.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0232b = s.b.EnumC0232b.g;
            enumC0232b2 = s.b.EnumC0232b.h;
            enumC0232b3 = s.b.EnumC0232b.e;
            str = "operation.fragment.mView";
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            s.b bVar4 = (s.b) next;
            View view4 = bVar4.c.mView;
            Intrinsics.checkNotNullExpressionValue(view4, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view4, "<this>");
            if (view4.getAlpha() == 0.0f && view4.getVisibility() == 0) {
                enumC0232b8 = enumC0232b2;
            } else {
                int visibility = view4.getVisibility();
                if (visibility == 0) {
                    enumC0232b8 = enumC0232b3;
                } else if (visibility == 4) {
                    enumC0232b8 = enumC0232b2;
                } else {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(EK.e(visibility, "Unknown visibility "));
                    }
                    enumC0232b8 = enumC0232b;
                }
            }
            if (enumC0232b8 == enumC0232b3 && bVar4.a != enumC0232b3) {
                break;
            }
        }
        final s.b bVar5 = (s.b) next;
        ListIterator listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            s.b bVar6 = (s.b) objPrevious;
            View view5 = bVar6.c.mView;
            Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
            Intrinsics.checkNotNullParameter(view5, "<this>");
            if (view5.getAlpha() == 0.0f && view5.getVisibility() == 0) {
                enumC0232b7 = enumC0232b2;
            } else {
                int visibility2 = view5.getVisibility();
                if (visibility2 == 0) {
                    enumC0232b7 = enumC0232b3;
                } else if (visibility2 == 4) {
                    enumC0232b7 = enumC0232b2;
                } else {
                    if (visibility2 != 8) {
                        throw new IllegalArgumentException(EK.e(visibility2, "Unknown visibility "));
                    }
                    enumC0232b7 = enumC0232b;
                }
            }
            if (enumC0232b7 != enumC0232b3 && bVar6.a == enumC0232b3) {
                break;
            }
        }
        final s.b bVar7 = (s.b) objPrevious;
        int i3 = 2;
        if (FragmentManager.G(2)) {
            Objects.toString(bVar5);
            Objects.toString(bVar7);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList<c> arrayList10 = new ArrayList();
        final ArrayList arrayListF0 = CollectionsKt.f0(operations);
        Fragment fragment3 = ((s.b) CollectionsKt.L(operations)).c;
        Iterator it2 = operations.iterator();
        while (it2.hasNext()) {
            int i4 = i3;
            Fragment.j jVar = ((s.b) it2.next()).c.mAnimationInfo;
            Fragment.j jVar2 = fragment3.mAnimationInfo;
            jVar.b = jVar2.b;
            jVar.c = jVar2.c;
            jVar.d = jVar2.d;
            jVar.e = jVar2.e;
            i3 = i4;
        }
        int i5 = i3;
        Iterator it3 = operations.iterator();
        while (it3.hasNext()) {
            final s.b bVar8 = (s.b) it3.next();
            C7300vy signal = new C7300vy();
            bVar8.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            bVar8.d();
            LinkedHashSet linkedHashSet = bVar8.e;
            linkedHashSet.add(signal);
            Iterator it4 = it3;
            arrayList9.add(new a(bVar8, signal, z));
            C7300vy signal2 = new C7300vy();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            bVar8.d();
            linkedHashSet.add(signal2);
            arrayList10.add(new c(bVar8, signal2, z, !z ? bVar8 != bVar7 : bVar8 != bVar5));
            Runnable listener = new Runnable() { // from class: androidx.fragment.app.c
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList awaitingContainerChanges = arrayListF0;
                    Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                    s.b operation = bVar8;
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    d this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (awaitingContainerChanges.contains(operation)) {
                        awaitingContainerChanges.remove(operation);
                        this$0.getClass();
                        View view6 = operation.c.mView;
                        s.b.EnumC0232b enumC0232b9 = operation.a;
                        Intrinsics.checkNotNullExpressionValue(view6, "view");
                        enumC0232b9.b(view6);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            bVar8.d.add(listener);
            it3 = it4;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList11 = new ArrayList();
        for (Object obj3 : arrayList10) {
            if (!((c) obj3).b()) {
                arrayList11.add(obj3);
            }
        }
        ArrayList<c> arrayList12 = new ArrayList();
        for (Object obj4 : arrayList11) {
            if (((c) obj4).c() != null) {
                arrayList12.add(obj4);
            }
        }
        AbstractC1605Ni0 abstractC1605Ni1 = null;
        for (c cVar : arrayList12) {
            AbstractC1605Ni0 abstractC1605Ni0C = cVar.c();
            if (abstractC1605Ni1 != null && abstractC1605Ni0C != abstractC1605Ni1) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(cVar.a.c);
                sb.append(" returned Transition ");
                throw new IllegalArgumentException(K1.a(sb, cVar.c, " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC1605Ni1 = abstractC1605Ni0C;
        }
        ViewGroup viewGroup = this.a;
        if (abstractC1605Ni1 == null) {
            for (c cVar2 : arrayList10) {
                linkedHashMap3.put(cVar2.a, Boolean.FALSE);
                cVar2.a();
            }
            arrayList = arrayList9;
            bVar = bVar7;
            arrayList2 = arrayListF0;
            enumC0232b4 = enumC0232b;
            linkedHashMap = linkedHashMap3;
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList13 = new ArrayList<>();
            arrayList = arrayList9;
            ArrayList<View> arrayList14 = new ArrayList<>();
            C8092zj c8092zj2 = new C8092zj();
            Iterator it5 = arrayList10.iterator();
            s.b.EnumC0232b enumC0232b9 = enumC0232b3;
            Object obj5 = null;
            boolean z5 = false;
            View view7 = null;
            while (it5.hasNext()) {
                Object obj6 = obj5;
                Object obj7 = ((c) it5.next()).e;
                if (obj7 == null || bVar5 == null || bVar7 == null) {
                    c8092zj = c8092zj2;
                    enumC0232b6 = enumC0232b;
                    arrayList5 = arrayListF0;
                    str2 = str;
                    linkedHashMap2 = linkedHashMap3;
                    rect = rect2;
                    obj5 = obj6;
                    arrayList14 = arrayList14;
                    abstractC1605Ni1 = abstractC1605Ni1;
                    arrayListF0 = arrayList5;
                    str = str2;
                    c8092zj2 = c8092zj;
                    rect2 = rect;
                    linkedHashMap3 = linkedHashMap2;
                    enumC0232b = enumC0232b6;
                } else {
                    Object objR = abstractC1605Ni1.r(abstractC1605Ni1.f(obj7));
                    arrayList5 = arrayListF0;
                    Fragment fragment4 = bVar7.c;
                    enumC0232b6 = enumC0232b;
                    ArrayList<String> sharedElementSourceNames = fragment4.getSharedElementSourceNames();
                    str2 = str;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment5 = bVar5.c;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = fragment5.getSharedElementSourceNames();
                    View view8 = view6;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = fragment5.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    ArrayList<View> arrayList15 = arrayList14;
                    int i6 = 0;
                    while (i6 < size) {
                        int i7 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i6));
                        ArrayList<String> arrayList16 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i6));
                        }
                        i6++;
                        size = i7;
                        sharedElementTargetNames = arrayList16;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment4.getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z ? new Pair(fragment5.getExitTransitionCallback(), fragment4.getEnterTransitionCallback()) : new Pair(fragment5.getEnterTransitionCallback(), fragment4.getExitTransitionCallback());
                    AbstractC5700oK1 abstractC5700oK1 = (AbstractC5700oK1) pair.d;
                    AbstractC5700oK1 abstractC5700oK2 = (AbstractC5700oK1) pair.e;
                    int size2 = sharedElementSourceNames.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        c8092zj2.put(sharedElementSourceNames.get(i8), sharedElementTargetNames2.get(i8));
                        i8++;
                        abstractC5700oK2 = abstractC5700oK2;
                    }
                    AbstractC5700oK1 abstractC5700oK3 = abstractC5700oK2;
                    if (FragmentManager.G(i5)) {
                        for (String str3 : sharedElementTargetNames2) {
                        }
                        for (String str4 : sharedElementSourceNames) {
                        }
                    }
                    C8092zj c8092zj3 = new C8092zj();
                    View view9 = fragment5.mView;
                    Intrinsics.checkNotNullExpressionValue(view9, "firstOut.fragment.mView");
                    j(c8092zj3, view9);
                    AbstractC6155qW0.k(c8092zj3, sharedElementSourceNames);
                    if (abstractC5700oK1 != null) {
                        if (FragmentManager.G(i5)) {
                            bVar5.toString();
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i9 = size3 - 1;
                                String str5 = sharedElementSourceNames.get(size3);
                                View view10 = (View) c8092zj3.getOrDefault(str5, null);
                                if (view10 == null) {
                                    c8092zj2.remove(str5);
                                } else {
                                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                                    if (!Intrinsics.a(str5, Cd2.d.k(view10))) {
                                        c8092zj2.put(Cd2.d.k(view10), (String) c8092zj2.remove(str5));
                                    }
                                }
                                if (i9 < 0) {
                                    break;
                                } else {
                                    size3 = i9;
                                }
                            }
                        }
                    } else {
                        AbstractC6155qW0.k(c8092zj2, c8092zj3.keySet());
                    }
                    final C8092zj namedViews = new C8092zj();
                    View view11 = fragment4.mView;
                    AbstractC1605Ni0 abstractC1605Ni2 = abstractC1605Ni1;
                    Intrinsics.checkNotNullExpressionValue(view11, "lastIn.fragment.mView");
                    j(namedViews, view11);
                    AbstractC6155qW0.k(namedViews, sharedElementTargetNames2);
                    AbstractC6155qW0.k(namedViews, c8092zj2.values());
                    if (abstractC5700oK3 != null) {
                        if (FragmentManager.G(i5)) {
                            bVar7.toString();
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i10 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view12 = (View) namedViews.getOrDefault(name, null);
                                if (view12 == null) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strB = C1213Ii0.b(c8092zj2, name);
                                    if (strB != null) {
                                        c8092zj2.remove(strB);
                                    }
                                    arrayList6 = sharedElementTargetNames2;
                                } else {
                                    WeakHashMap<View, C5345me2> weakHashMap2 = Cd2.a;
                                    arrayList6 = sharedElementTargetNames2;
                                    if (!Intrinsics.a(name, Cd2.d.k(view12))) {
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        String strB2 = C1213Ii0.b(c8092zj2, name);
                                        if (strB2 != null) {
                                            c8092zj2.put(strB2, Cd2.d.k(view12));
                                        }
                                    }
                                }
                                if (i10 < 0) {
                                    break;
                                }
                                size4 = i10;
                                sharedElementTargetNames2 = arrayList6;
                            }
                        } else {
                            arrayList6 = sharedElementTargetNames2;
                        }
                    } else {
                        arrayList6 = sharedElementTargetNames2;
                        C1291Ji0 c1291Ji0 = C1213Ii0.a;
                        Intrinsics.checkNotNullParameter(c8092zj2, "<this>");
                        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                        for (int i11 = c8092zj2.g - 1; -1 < i11; i11--) {
                            if (!namedViews.containsKey((String) c8092zj2.m(i11))) {
                                c8092zj2.k(i11);
                            }
                        }
                    }
                    Set setKeySet = c8092zj2.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                    Set entries = c8092zj3.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    c8092zj = c8092zj2;
                    C4213hW predicate = new C4213hW(setKeySet);
                    Intrinsics.checkNotNullParameter(entries, "<this>");
                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                    C2904bF.q(entries, predicate, false);
                    Collection collectionValues = c8092zj.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                    Set entries2 = namedViews.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                    C4213hW predicate2 = new C4213hW(collectionValues);
                    Intrinsics.checkNotNullParameter(entries2, "<this>");
                    Intrinsics.checkNotNullParameter(predicate2, "predicate");
                    C2904bF.q(entries2, predicate2, false);
                    if (c8092zj.isEmpty()) {
                        arrayList13.clear();
                        arrayList15.clear();
                        abstractC1605Ni1 = abstractC1605Ni2;
                        arrayList14 = arrayList15;
                        arrayListF0 = arrayList5;
                        enumC0232b = enumC0232b6;
                        str = str2;
                        linkedHashMap3 = linkedHashMap4;
                        view6 = view8;
                        rect2 = rect3;
                        c8092zj2 = c8092zj;
                        obj5 = null;
                    } else {
                        C1213Ii0.a(fragment4, fragment5, z, c8092zj3);
                        ViewTreeObserverOnPreDrawListenerC7556x91.a(viewGroup, new Runnable() { // from class: eW
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8092zj lastInViews = namedViews;
                                Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
                                s.b bVar9 = bVar7;
                                s.b bVar10 = bVar5;
                                C1213Ii0.a(bVar9.c, bVar10.c, z, lastInViews);
                            }
                        });
                        arrayList13.addAll(c8092zj3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            abstractC1605Ni0 = abstractC1605Ni2;
                            obj2 = objR;
                        } else {
                            View view13 = (View) c8092zj3.getOrDefault(sharedElementSourceNames.get(0), null);
                            abstractC1605Ni0 = abstractC1605Ni2;
                            obj2 = objR;
                            abstractC1605Ni0.m(view13, obj2);
                            view7 = view13;
                        }
                        arrayList15.addAll(namedViews.values());
                        if (arrayList6.isEmpty() || (view2 = (View) namedViews.getOrDefault(arrayList6.get(0), null)) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            ViewTreeObserverOnPreDrawListenerC7556x91.a(viewGroup, new RunnableC3793fW(abstractC1605Ni0, view2, rect, 0));
                            z5 = true;
                        }
                        view6 = view8;
                        abstractC1605Ni0.p(obj2, view6, arrayList13);
                        Object obj8 = obj2;
                        abstractC1605Ni0.l(obj8, null, null, obj2, arrayList15);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(bVar5, bool);
                        linkedHashMap2.put(bVar7, bool);
                        arrayList14 = arrayList15;
                        abstractC1605Ni1 = abstractC1605Ni0;
                        obj5 = obj8;
                        arrayListF0 = arrayList5;
                        str = str2;
                        c8092zj2 = c8092zj;
                        rect2 = rect;
                        linkedHashMap3 = linkedHashMap2;
                        enumC0232b = enumC0232b6;
                    }
                }
            }
            C2703aM1 c2703aM2 = c8092zj2;
            s.b.EnumC0232b enumC0232b10 = enumC0232b;
            Object obj9 = obj5;
            arrayList2 = arrayListF0;
            String str6 = str;
            ArrayList<View> arrayList17 = arrayList14;
            linkedHashMap = linkedHashMap3;
            Rect rect4 = rect2;
            AbstractC1605Ni0 abstractC1605Ni3 = abstractC1605Ni1;
            ArrayList arrayList18 = new ArrayList();
            Iterator it6 = arrayList10.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it6.hasNext()) {
                c cVar3 = (c) it6.next();
                boolean zB = cVar3.b();
                s.b bVar9 = cVar3.a;
                if (zB) {
                    linkedHashMap.put(bVar9, Boolean.FALSE);
                    cVar3.a();
                } else {
                    Object objF = abstractC1605Ni3.f(cVar3.c);
                    boolean z6 = obj9 != null && (bVar9 == bVar5 || bVar9 == bVar7);
                    if (objF != null) {
                        Iterator it7 = it6;
                        ArrayList<View> arrayList19 = new ArrayList<>();
                        ArrayList<View> arrayList20 = arrayList13;
                        Fragment fragment6 = bVar9.c;
                        ArrayList<View> arrayList21 = arrayList17;
                        View view14 = fragment6.mView;
                        s.b bVar10 = bVar7;
                        String str7 = str6;
                        Intrinsics.checkNotNullExpressionValue(view14, str7);
                        i(view14, arrayList19);
                        if (z6) {
                            if (bVar9 == bVar5) {
                                arrayList19.removeAll(CollectionsKt.h0(arrayList20));
                            } else {
                                arrayList19.removeAll(CollectionsKt.h0(arrayList21));
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            abstractC1605Ni3.a(view6, objF);
                            arrayList4 = arrayList19;
                            str6 = str7;
                            obj = objF;
                            enumC0232b5 = enumC0232b10;
                        } else {
                            abstractC1605Ni3.b(objF, arrayList19);
                            abstractC1605Ni3.l(objF, objF, arrayList19, null, null);
                            obj = objF;
                            arrayList4 = arrayList19;
                            str6 = str7;
                            enumC0232b5 = enumC0232b10;
                            if (bVar9.a == enumC0232b5) {
                                arrayList2.remove(bVar9);
                                ArrayList<View> arrayList22 = new ArrayList<>(arrayList4);
                                arrayList22.remove(fragment6.mView);
                                abstractC1605Ni3.k(obj, fragment6.mView, arrayList22);
                                ViewTreeObserverOnPreDrawListenerC7556x91.a(viewGroup, new RunnableC2477Yd(arrayList4, 3));
                            }
                        }
                        s.b.EnumC0232b enumC0232b11 = enumC0232b9;
                        if (bVar9.a == enumC0232b11) {
                            arrayList18.addAll(arrayList4);
                            if (z5) {
                                abstractC1605Ni3.n(obj, rect4);
                            }
                            view = view7;
                        } else {
                            view = view7;
                            abstractC1605Ni3.m(view, obj);
                        }
                        linkedHashMap.put(bVar9, Boolean.TRUE);
                        if (cVar3.d) {
                            objJ = abstractC1605Ni3.j(objJ, obj);
                        } else {
                            objJ2 = abstractC1605Ni3.j(objJ2, obj);
                        }
                        it6 = it7;
                        view7 = view;
                        enumC0232b9 = enumC0232b11;
                        enumC0232b10 = enumC0232b5;
                        view6 = view6;
                        arrayList13 = arrayList20;
                        arrayList17 = arrayList21;
                        bVar7 = bVar10;
                    } else if (!z6) {
                        linkedHashMap.put(bVar9, Boolean.FALSE);
                        cVar3.a();
                    }
                }
            }
            ArrayList<View> arrayList23 = arrayList13;
            ArrayList<View> arrayList24 = arrayList17;
            s.b bVar11 = bVar7;
            enumC0232b4 = enumC0232b10;
            Object objI = abstractC1605Ni3.i(objJ, objJ2, obj9);
            if (objI != null) {
                ArrayList<c> arrayList25 = new ArrayList();
                for (Object obj10 : arrayList10) {
                    if (!((c) obj10).b()) {
                        arrayList25.add(obj10);
                    }
                }
                for (c cVar4 : arrayList25) {
                    Object obj11 = cVar4.c;
                    s.b bVar12 = cVar4.a;
                    s.b bVar13 = bVar11;
                    boolean z7 = obj9 != null && (bVar12 == bVar5 || bVar12 == bVar13);
                    if (obj11 != null || z7) {
                        WeakHashMap<View, C5345me2> weakHashMap3 = Cd2.a;
                        if (viewGroup.isLaidOut()) {
                            abstractC1605Ni3.o(objI, new RunnableC4003gW(0, cVar4, bVar12));
                        } else {
                            if (FragmentManager.G(i5)) {
                                Objects.toString(viewGroup);
                                Objects.toString(bVar12);
                            }
                            cVar4.a();
                        }
                    }
                    bVar11 = bVar13;
                }
                bVar = bVar11;
                WeakHashMap<View, C5345me2> weakHashMap4 = Cd2.a;
                if (viewGroup.isLaidOut()) {
                    C1213Ii0.c(4, arrayList18);
                    ArrayList arrayList26 = new ArrayList();
                    int size5 = arrayList24.size();
                    int i12 = 0;
                    while (i12 < size5) {
                        ArrayList<View> arrayList27 = arrayList24;
                        View view15 = arrayList27.get(i12);
                        WeakHashMap<View, C5345me2> weakHashMap5 = Cd2.a;
                        arrayList26.add(Cd2.d.k(view15));
                        Cd2.d.v(view15, null);
                        i12++;
                        arrayList24 = arrayList27;
                    }
                    ArrayList<View> arrayList28 = arrayList24;
                    if (FragmentManager.G(i5)) {
                        for (View sharedElementFirstOutViews : arrayList23) {
                            Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view16 = sharedElementFirstOutViews;
                            Objects.toString(view16);
                            Cd2.d.k(view16);
                        }
                        for (View sharedElementLastInViews : arrayList28) {
                            Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                            View view17 = sharedElementLastInViews;
                            Objects.toString(view17);
                            Cd2.d.k(view17);
                        }
                    }
                    abstractC1605Ni3.c(viewGroup, objI);
                    int size6 = arrayList28.size();
                    ArrayList arrayList29 = new ArrayList();
                    int i13 = 0;
                    while (i13 < size6) {
                        ArrayList<View> arrayList30 = arrayList23;
                        View view18 = arrayList30.get(i13);
                        WeakHashMap<View, C5345me2> weakHashMap6 = Cd2.a;
                        String strK = Cd2.d.k(view18);
                        arrayList29.add(strK);
                        if (strK == null) {
                            i2 = size6;
                            arrayList3 = arrayList29;
                            i = i13;
                            c2703aM1 = c2703aM2;
                        } else {
                            arrayList3 = arrayList29;
                            Cd2.d.v(view18, null);
                            c2703aM1 = c2703aM2;
                            String str8 = (String) c2703aM1.getOrDefault(strK, null);
                            i = i13;
                            int i14 = 0;
                            while (true) {
                                i2 = size6;
                                if (i14 >= size6) {
                                    break;
                                }
                                if (str8.equals(arrayList26.get(i14))) {
                                    Cd2.d.v(arrayList28.get(i14), strK);
                                    break;
                                } else {
                                    i14++;
                                    size6 = i2;
                                }
                            }
                        }
                        i13 = i + 1;
                        arrayList23 = arrayList30;
                        c2703aM2 = c2703aM1;
                        size6 = i2;
                        arrayList29 = arrayList3;
                    }
                    ArrayList<View> arrayList31 = arrayList23;
                    ViewTreeObserverOnPreDrawListenerC7556x91.a(viewGroup, new RunnableC1524Mi0(size6, arrayList28, arrayList26, arrayList31, arrayList29));
                    z2 = false;
                    C1213Ii0.c(0, arrayList18);
                    abstractC1605Ni3.q(obj9, arrayList31, arrayList28);
                }
                zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
                context = viewGroup.getContext();
                arrayList7 = new ArrayList();
                z3 = z2;
                for (a aVar : arrayList) {
                    if (aVar.b()) {
                        aVar.a();
                    } else {
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        aVarC2 = aVar.c(context);
                        if (aVarC2 == null) {
                            aVar.a();
                        } else {
                            animator = aVarC2.b;
                            if (animator == null) {
                                arrayList7.add(aVar);
                            } else {
                                bVar3 = aVar.a;
                                zA = Intrinsics.a(linkedHashMap.get(bVar3), Boolean.TRUE);
                                fragment2 = bVar3.c;
                                if (zA) {
                                    if (FragmentManager.G(i5)) {
                                        Objects.toString(fragment2);
                                    }
                                    aVar.a();
                                } else {
                                    if (bVar3.a == enumC0232b4) {
                                        z4 = true;
                                    } else {
                                        z4 = z2;
                                    }
                                    arrayList8 = arrayList2;
                                    if (z4) {
                                        arrayList8.remove(bVar3);
                                    }
                                    View view19 = fragment2.mView;
                                    viewGroup.startViewTransition(view19);
                                    arrayList2 = arrayList8;
                                    animator.addListener(new e(this, view19, z4, bVar3, aVar));
                                    animator.setTarget(view19);
                                    animator.start();
                                    if (FragmentManager.G(i5)) {
                                        bVar3.toString();
                                    }
                                    aVar.b.a(new C7300vy.a() { // from class: cW
                                        @Override // defpackage.C7300vy.a
                                        public final void a() {
                                            s.b operation = bVar3;
                                            Intrinsics.checkNotNullParameter(operation, "$operation");
                                            animator.end();
                                            if (FragmentManager.G(2)) {
                                                Objects.toString(operation);
                                            }
                                        }
                                    });
                                    z3 = true;
                                    z2 = false;
                                }
                            }
                        }
                    }
                }
                for (final a aVar2 : arrayList7) {
                    bVar2 = aVar2.a;
                    fragment = bVar2.c;
                    if (zContainsValue) {
                        if (FragmentManager.G(i5)) {
                            Objects.toString(fragment);
                        }
                        aVar2.a();
                    } else if (z3) {
                        if (FragmentManager.G(i5)) {
                            Objects.toString(fragment);
                        }
                        aVar2.a();
                    } else {
                        view3 = fragment.mView;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        aVarC = aVar2.c(context);
                        if (aVarC != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animation = aVarC.a;
                        if (animation != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (bVar2.a != s.b.EnumC0232b.d) {
                            view3.startAnimation(animation);
                            aVar2.a();
                        } else {
                            viewGroup.startViewTransition(view3);
                            h.b bVar14 = new h.b(animation, viewGroup, view3);
                            bVar14.setAnimationListener(new f(view3, aVar2, this, bVar2));
                            view3.startAnimation(bVar14);
                            if (FragmentManager.G(i5)) {
                                bVar2.toString();
                            }
                        }
                        aVar2.b.a(new C7300vy.a() { // from class: dW
                            @Override // defpackage.C7300vy.a
                            public final void a() {
                                d this$0 = this;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                d.a animationInfo = aVar2;
                                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                                s.b operation = bVar2;
                                Intrinsics.checkNotNullParameter(operation, "$operation");
                                View view20 = view3;
                                view20.clearAnimation();
                                this$0.a.endViewTransition(view20);
                                animationInfo.a();
                                if (FragmentManager.G(2)) {
                                    Objects.toString(operation);
                                }
                            }
                        });
                    }
                }
                for (s.b bVar15 : arrayList2) {
                    View view20 = bVar15.c.mView;
                    s.b.EnumC0232b enumC0232b12 = bVar15.a;
                    Intrinsics.checkNotNullExpressionValue(view20, "view");
                    enumC0232b12.b(view20);
                }
                arrayList2.clear();
                if (FragmentManager.G(i5)) {
                    Objects.toString(bVar5);
                    Objects.toString(bVar);
                }
            }
            bVar = bVar11;
        }
        z2 = false;
        zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList7 = new ArrayList();
        z3 = z2;
        while (r15.hasNext()) {
            if (aVar.b()) {
                aVar.a();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                aVarC2 = aVar.c(context);
                if (aVarC2 == null) {
                    aVar.a();
                } else {
                    animator = aVarC2.b;
                    if (animator == null) {
                        arrayList7.add(aVar);
                    } else {
                        bVar3 = aVar.a;
                        zA = Intrinsics.a(linkedHashMap.get(bVar3), Boolean.TRUE);
                        fragment2 = bVar3.c;
                        if (zA) {
                            if (FragmentManager.G(i5)) {
                                Objects.toString(fragment2);
                            }
                            aVar.a();
                        } else {
                            if (bVar3.a == enumC0232b4) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            arrayList8 = arrayList2;
                            if (z4) {
                                arrayList8.remove(bVar3);
                            }
                            View view110 = fragment2.mView;
                            viewGroup.startViewTransition(view110);
                            arrayList2 = arrayList8;
                            animator.addListener(new e(this, view110, z4, bVar3, aVar));
                            animator.setTarget(view110);
                            animator.start();
                            if (FragmentManager.G(i5)) {
                                bVar3.toString();
                            }
                            aVar.b.a(new C7300vy.a() { // from class: cW
                                @Override // defpackage.C7300vy.a
                                public final void a() {
                                    s.b operation = bVar3;
                                    Intrinsics.checkNotNullParameter(operation, "$operation");
                                    animator.end();
                                    if (FragmentManager.G(2)) {
                                        Objects.toString(operation);
                                    }
                                }
                            });
                            z3 = true;
                            z2 = false;
                        }
                    }
                }
            }
        }
        while (r3.hasNext()) {
            bVar2 = aVar2.a;
            fragment = bVar2.c;
            if (zContainsValue) {
                if (FragmentManager.G(i5)) {
                    Objects.toString(fragment);
                }
                aVar2.a();
            } else if (z3) {
                if (FragmentManager.G(i5)) {
                    Objects.toString(fragment);
                }
                aVar2.a();
            } else {
                view3 = fragment.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                aVarC = aVar2.c(context);
                if (aVarC != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                animation = aVarC.a;
                if (animation != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (bVar2.a != s.b.EnumC0232b.d) {
                    view3.startAnimation(animation);
                    aVar2.a();
                } else {
                    viewGroup.startViewTransition(view3);
                    h.b bVar16 = new h.b(animation, viewGroup, view3);
                    bVar16.setAnimationListener(new f(view3, aVar2, this, bVar2));
                    view3.startAnimation(bVar16);
                    if (FragmentManager.G(i5)) {
                        bVar2.toString();
                    }
                }
                aVar2.b.a(new C7300vy.a() { // from class: dW
                    @Override // defpackage.C7300vy.a
                    public final void a() {
                        d this$0 = this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        d.a animationInfo = aVar2;
                        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                        s.b operation = bVar2;
                        Intrinsics.checkNotNullParameter(operation, "$operation");
                        View view21 = view3;
                        view21.clearAnimation();
                        this$0.a.endViewTransition(view21);
                        animationInfo.a();
                        if (FragmentManager.G(2)) {
                            Objects.toString(operation);
                        }
                    }
                });
            }
        }
        while (r0.hasNext()) {
            View view21 = bVar15.c.mView;
            s.b.EnumC0232b enumC0232b13 = bVar15.a;
            Intrinsics.checkNotNullExpressionValue(view21, "view");
            enumC0232b13.b(view21);
        }
        arrayList2.clear();
        if (FragmentManager.G(i5)) {
            Objects.toString(bVar5);
            Objects.toString(bVar);
        }
    }
}
