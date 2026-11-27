package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7169vK1<T> implements InterfaceC7191vS<T> {

    @NotNull
    public final C7590xK1 a;

    @NotNull
    public final C7380wK1 b;

    @Nullable
    public final Context c;

    @Nullable
    public final String d;

    @NotNull
    public final KW1 e;

    @Nullable
    public final LinkedHashSet f;

    /* JADX INFO: renamed from: vK1$a */
    public static final class a {
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: vK1$b */
    @InterfaceC3368dU(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    public static final class b extends LM {
        public C7169vK1 d;
        public /* synthetic */ Object e;
        public int h;

        public b(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C7169vK1.this.k(this, null);
        }
    }

    public C7169vK1(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set keysToMigrate, @NotNull C7590xK1 shouldRunMigration, @NotNull C7380wK1 migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        C6959uK1 c6959uK1 = new C6959uK1(context, sharedPreferencesName);
        this.a = shouldRunMigration;
        this.b = migrate;
        this.c = context;
        this.d = sharedPreferencesName;
        this.e = XO0.b(c6959uK1);
        this.f = keysToMigrate == C8010zK1.a ? null : CollectionsKt.g0(keysToMigrate);
    }

    @Override // defpackage.InterfaceC7191vS
    @Nullable
    public final Unit j() throws IOException {
        Context context;
        String str;
        KW1 kw1 = this.e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) kw1.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) kw1.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            a.a(context, str);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7191vS
    @Nullable
    public final Object k(@NotNull JM jm, Object obj) {
        b bVar;
        C7169vK1<T> c7169vK1;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.h = i - Integer.MIN_VALUE;
            } else {
                bVar = new b((LM) jm);
            }
        } else {
            bVar = new b((LM) jm);
        }
        Object objInvoke = bVar.e;
        MN mn = MN.d;
        int i2 = bVar.h;
        boolean z = true;
        if (i2 == 0) {
            C1795Pt1.b(objInvoke);
            bVar.d = this;
            bVar.h = 1;
            objInvoke = this.a.invoke(obj, bVar);
            if (objInvoke == mn) {
                return mn;
            }
            c7169vK1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7169vK1 = bVar.d;
            C1795Pt1.b(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = c7169vK1.f;
        KW1 kw1 = c7169vK1.e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) kw1.getValue()).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) kw1.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC7191vS
    @Nullable
    public final Object l(Object obj, @NotNull C7822yS c7822yS) {
        return this.b.k(new BK1((SharedPreferences) this.e.getValue(), this.f), obj, c7822yS);
    }
}
