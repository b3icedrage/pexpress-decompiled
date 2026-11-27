package defpackage;

import android.annotation.SuppressLint;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4428iX1 {

    @NotNull
    public final String a;

    @NotNull
    public final Object b;

    @NotNull
    public final AbstractSet c;

    @Nullable
    public final AbstractSet d;

    /* JADX INFO: renamed from: iX1$a */
    public static final class a {

        @NotNull
        public final String a;

        @NotNull
        public final String b;
        public final boolean c;
        public final int d;

        @Nullable
        public final String e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: iX1$a$a, reason: collision with other inner class name */
        public static final class C0377a {
            @SuppressLint({"SyntheticAccessor"})
            public static boolean a(@NotNull String current, @Nullable String str) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.a(current, str)) {
                    return true;
                }
                if (current.length() != 0) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i < current.length()) {
                        char cCharAt = current.charAt(i);
                        int i4 = i3 + 1;
                        if (i3 != 0 || cCharAt == '(') {
                            if (cCharAt == '(') {
                                i2++;
                            } else if (cCharAt != ')' || (i2 = i2 - 1) != 0 || i3 == current.length() - 1) {
                            }
                            i++;
                            i3 = i4;
                        }
                    }
                    if (i2 == 0) {
                        String strSubstring = current.substring(1, current.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return Intrinsics.a(StringsKt.d0(strSubstring).toString(), str);
                    }
                }
                return false;
            }
        }

        public a(@NotNull String name, @NotNull String type, boolean z, int i, @Nullable String str, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = name;
            this.b = type;
            this.c = z;
            this.d = i;
            this.e = str;
            this.f = i2;
            int i3 = 5;
            if (type != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = type.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (StringsKt.C(upperCase, "INT", false)) {
                    i3 = 3;
                } else if (StringsKt.C(upperCase, "CHAR", false) || StringsKt.C(upperCase, "CLOB", false) || StringsKt.C(upperCase, "TEXT", false)) {
                    i3 = 2;
                } else if (!StringsKt.C(upperCase, "BLOB", false)) {
                    i3 = (StringsKt.C(upperCase, "REAL", false) || StringsKt.C(upperCase, "FLOA", false) || StringsKt.C(upperCase, "DOUB", false)) ? 4 : 1;
                }
            }
            this.g = i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (this.d != aVar.d) {
                    return false;
                }
                if (!Intrinsics.a(this.a, aVar.a) || this.c != aVar.c) {
                    return false;
                }
                int i = aVar.f;
                String str = aVar.e;
                String str2 = this.e;
                int i2 = this.f;
                if (i2 == 1 && i == 2 && str2 != null && !C0377a.a(str2, str)) {
                    return false;
                }
                if (i2 == 2 && i == 1 && str != null && !C0377a.a(str, str2)) {
                    return false;
                }
                if (i2 != 0 && i2 == i) {
                    if (str2 != null) {
                        if (!C0377a.a(str2, str)) {
                            return false;
                        }
                    } else if (str != null) {
                        return false;
                    }
                }
                if (this.g != aVar.g) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            return C5807oq.b(sb, str, "'}");
        }
    }

    /* JADX INFO: renamed from: iX1$b */
    public static final class b {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        @NotNull
        public final String c;

        @NotNull
        public final List<String> d;

        @NotNull
        public final List<String> e;

        public b(@NotNull String referenceTable, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List<String> columnNames, @NotNull List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.a = referenceTable;
            this.b = onDelete;
            this.c = onUpdate;
            this.d = columnNames;
            this.e = referenceColumnNames;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.a(this.a, bVar.a) && Intrinsics.a(this.b, bVar.b) && Intrinsics.a(this.c, bVar.c) && Intrinsics.a(this.d, bVar.d)) {
                return Intrinsics.a(this.e, bVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + C5491nL.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        @NotNull
        public final String toString() {
            return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    /* JADX INFO: renamed from: iX1$c */
    public static final class c implements Comparable<c> {
        public final int d;
        public final int e;

        @NotNull
        public final String g;

        @NotNull
        public final String h;

        public c(int i, int i2, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.d = i;
            this.e = i2;
            this.g = from;
            this.h = to;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c other = cVar;
            Intrinsics.checkNotNullParameter(other, "other");
            int i = this.d - other.d;
            return i == 0 ? this.e - other.e : i;
        }
    }

    /* JADX INFO: renamed from: iX1$d */
    public static final class d {

        @NotNull
        public final String a;
        public final boolean b;

        @NotNull
        public final List<String> c;

        @NotNull
        public final List<String> d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
        public d(@NotNull String name, boolean z, @NotNull List<String> columns, @NotNull List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.a = name;
            this.b = z;
            this.c = columns;
            this.d = orders;
            if (orders.isEmpty()) {
                int size = columns.size();
                orders = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    orders.add("ASC");
                }
            }
            this.d = orders;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.b == dVar.b && Intrinsics.a(this.c, dVar.c) && Intrinsics.a(this.d, dVar.d)) {
                    String str = this.a;
                    boolean zO = kotlin.text.d.o(str, "index_", false);
                    String str2 = dVar.a;
                    return zO ? kotlin.text.d.o(str2, "index_", false) : str.equals(str2);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + C5491nL.b((((kotlin.text.d.o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
        }

        @NotNull
        public final String toString() {
            return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "'}";
        }
    }

    public C4428iX1(@NotNull String name, @NotNull Map columns, @NotNull AbstractSet foreignKeys, @Nullable AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.a = name;
        this.b = columns;
        this.c = foreignKeys;
        this.d = abstractSet;
    }

    @NotNull
    public static final C4428iX1 a(@NotNull C3213cj0 database, @NotNull String tableName) {
        Map mapC;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor cursorF = database.f("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (cursorF.getColumnCount() <= 0) {
                mapC = PW0.c();
                cursorF.close();
            } else {
                int columnIndex = cursorF.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = cursorF.getColumnIndex("type");
                int columnIndex3 = cursorF.getColumnIndex("notnull");
                int columnIndex4 = cursorF.getColumnIndex("pk");
                int columnIndex5 = cursorF.getColumnIndex("dflt_value");
                C5315mW0 builder = new C5315mW0();
                while (cursorF.moveToNext()) {
                    String name = cursorF.getString(columnIndex);
                    String type = cursorF.getString(columnIndex2);
                    boolean z = cursorF.getInt(columnIndex3) != 0;
                    int i = cursorF.getInt(columnIndex4);
                    String string = cursorF.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new a(name, type, z, i, string, 2));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                mapC = builder.c();
                cursorF.close();
            }
            Cursor cursorF2 = database.f("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = cursorF2.getColumnIndex("id");
                int columnIndex7 = cursorF2.getColumnIndex("seq");
                int columnIndex8 = cursorF2.getColumnIndex("table");
                int columnIndex9 = cursorF2.getColumnIndex("on_delete");
                int columnIndex10 = cursorF2.getColumnIndex("on_update");
                List listJ = C0648Bc.j(cursorF2);
                cursorF2.moveToPosition(-1);
                C3337dJ1 c3337dJ1 = new C3337dJ1();
                while (cursorF2.moveToNext()) {
                    if (cursorF2.getInt(columnIndex7) == 0) {
                        int i2 = cursorF2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = columnIndex6;
                        ArrayList<c> arrayList3 = new ArrayList();
                        for (Object obj : listJ) {
                            int i4 = columnIndex7;
                            List list = listJ;
                            if (((c) obj).d == i2) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i4;
                            listJ = list;
                        }
                        int i5 = columnIndex7;
                        List list2 = listJ;
                        for (c cVar : arrayList3) {
                            arrayList.add(cVar.g);
                            arrayList2.add(cVar.h);
                        }
                        String string2 = cursorF2.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = cursorF2.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = cursorF2.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(onUpdateColumnIndex)");
                        c3337dJ1.add(new b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i3;
                        columnIndex7 = i5;
                        listJ = list2;
                    }
                }
                C3337dJ1 c3337dJ1A = C5487nJ1.a(c3337dJ1);
                cursorF2.close();
                Cursor cursorF3 = database.f("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int columnIndex11 = cursorF3.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = cursorF3.getColumnIndex("origin");
                    int columnIndex13 = cursorF3.getColumnIndex("unique");
                    C3337dJ1 c3337dJ1A2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorF3.close();
                    } else {
                        C3337dJ1 c3337dJ2 = new C3337dJ1();
                        while (cursorF3.moveToNext()) {
                            if ("c".equals(cursorF3.getString(columnIndex12))) {
                                String name2 = cursorF3.getString(columnIndex11);
                                boolean z2 = cursorF3.getInt(columnIndex13) == 1;
                                Intrinsics.checkNotNullExpressionValue(name2, "name");
                                d dVarL = C0648Bc.l(database, name2, z2);
                                if (dVarL == null) {
                                    cursorF3.close();
                                } else {
                                    c3337dJ2.add(dVarL);
                                }
                            }
                        }
                        c3337dJ1A2 = C5487nJ1.a(c3337dJ2);
                        cursorF3.close();
                    }
                    return new C4428iX1(tableName, mapC, c3337dJ1A, c3337dJ1A2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(cursorF3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C6621sj.b(cursorF2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                C6621sj.b(cursorF, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4428iX1)) {
            return false;
        }
        C4428iX1 c4428iX1 = (C4428iX1) obj;
        if (!this.a.equals(c4428iX1.a) || !this.b.equals(c4428iX1.b) || !Intrinsics.a(this.c, c4428iX1.c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.d;
        if (abstractSet2 == null || (abstractSet = c4428iX1.d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
