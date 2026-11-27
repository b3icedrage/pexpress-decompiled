package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class RA1 extends InterfaceC3376dW1.a {

    @Nullable
    public C4882kT b;

    @NotNull
    public final a c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;

    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(@NotNull C3213cj0 c3213cj0);

        public abstract void b(@NotNull C3213cj0 c3213cj0);

        public abstract void c(@NotNull C3213cj0 c3213cj0);

        public abstract void d(@NotNull C3213cj0 c3213cj0);

        public abstract void e(@NotNull C3213cj0 c3213cj0);

        @NotNull
        public abstract b f(@NotNull C3213cj0 c3213cj0);
    }

    public static class b {
        public final boolean a;

        @Nullable
        public final String b;

        public b(boolean z, @Nullable String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RA1(@NotNull C4882kT configuration, @NotNull a delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.b = configuration;
        this.c = delegate;
        this.d = identityHash;
        this.e = legacyHash;
    }

    @Override // defpackage.InterfaceC3376dW1.a
    public final void b(@NotNull C3213cj0 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
    }

    @Override // defpackage.InterfaceC3376dW1.a
    public final void c(@NotNull C3213cj0 db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorF = db.f("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorF.moveToFirst() && cursorF.getInt(0) == 0) {
                z = true;
            }
            cursorF.close();
            a aVar = this.c;
            aVar.a(db);
            if (!z) {
                b bVarF = aVar.f(db);
                if (!bVarF.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarF.b);
                }
            }
            g(db);
            aVar.c(db);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C6621sj.b(cursorF, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC3376dW1.a
    public final void d(@NotNull C3213cj0 db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        f(db, i, i2);
    }

    @Override // defpackage.InterfaceC3376dW1.a
    public final void e(@NotNull C3213cj0 db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        super.e(db);
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorF = db.f("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorF.moveToFirst() && cursorF.getInt(0) != 0;
            cursorF.close();
            a aVar = this.c;
            if (z) {
                Cursor cursorY = db.y(new C5496nM1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorY.moveToFirst() ? cursorY.getString(0) : null;
                    cursorY.close();
                    String str = this.d;
                    if (!str.equals(string) && !this.e.equals(string)) {
                        throw new IllegalStateException(BX.c("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(cursorY, th);
                        throw th2;
                    }
                }
            } else {
                b bVarF = aVar.f(db);
                if (!bVarF.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarF.b);
                }
                g(db);
            }
            aVar.d(db);
            this.b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                C6621sj.b(cursorF, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:1: B:12:0x0023->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0058 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC3376dW1.a
    public final void f(@NotNull C3213cj0 db, int i, int i2) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        Integer targetVersion;
        int i3;
        int iIntValue;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(db, "db");
        C4882kT c4882kT = this.b;
        a aVar = this.c;
        if (c4882kT != null) {
            QA1.d dVar = c4882kT.d;
            dVar.getClass();
            if (i == i2) {
                iterable = C5653o60.d;
            } else {
                boolean z2 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i;
                while (true) {
                    if (z2) {
                        if (iIntValue3 < i2) {
                            treeMap = (TreeMap) dVar.a.get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z2) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    targetVersion = (Integer) it.next();
                                    if (!z2) {
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue2 = targetVersion.intValue();
                                        if (i2 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj = treeMap.get(targetVersion);
                                            Intrinsics.checkNotNull(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = targetVersion.intValue();
                                            z = true;
                                            break;
                                            break;
                                        }
                                    } else {
                                        i3 = iIntValue3 + 1;
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue = targetVersion.intValue();
                                        if (i3 <= iIntValue && iIntValue <= i2) {
                                            Object obj2 = treeMap.get(targetVersion);
                                            Intrinsics.checkNotNull(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = targetVersion.intValue();
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i2) {
                        treeMap = (TreeMap) dVar.a.get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z2) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                    break;
                                }
                                targetVersion = (Integer) it.next();
                                if (!z2) {
                                    i3 = iIntValue3 + 1;
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue = targetVersion.intValue();
                                    if (i3 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue2 = targetVersion.intValue();
                                    if (i2 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                aVar.e(db);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractC3899g01) it2.next()).a(db);
                }
                b bVarF = aVar.f(db);
                if (bVarF.a) {
                    g(db);
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + bVarF.b);
                }
            }
        }
        C4882kT c4882kT2 = this.b;
        if (c4882kT2 != null) {
            if (!((i <= i2 || !c4882kT2.k) && c4882kT2.j && ((linkedHashSet = c4882kT2.l) == null || !linkedHashSet.contains(Integer.valueOf(i))))) {
                aVar.b(db);
                aVar.a(db);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void g(C3213cj0 c3213cj0) {
        c3213cj0.E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.d;
        Intrinsics.checkNotNullParameter(hash, "hash");
        c3213cj0.E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }
}
