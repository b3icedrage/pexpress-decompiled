package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class C7590xK1 extends AW1 implements Function2<AbstractC0662Bg1, JM<? super Boolean>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ Set<String> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7590xK1(Set<String> set, JM<? super C7590xK1> jm) {
        super(2, jm);
        this.e = set;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7590xK1 c7590xK1 = new C7590xK1(this.e, jm);
        c7590xK1.d = obj;
        return c7590xK1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC0662Bg1 abstractC0662Bg1, JM<? super Boolean> jm) {
        return ((C7590xK1) create(abstractC0662Bg1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        Set<AbstractC0662Bg1.a<?>> setKeySet = ((AbstractC0662Bg1) this.d).a().keySet();
        ArrayList arrayList = new ArrayList(XE.m(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0662Bg1.a) it.next()).a);
        }
        LinkedHashSet linkedHashSet = C7800yK1.a;
        boolean z = true;
        Set<String> set = this.e;
        if (set != linkedHashSet) {
            if (set == null || !set.isEmpty()) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
