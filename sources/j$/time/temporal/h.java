package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.w;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.r
    public final boolean R() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final v A() {
                return v.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean T(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.DAY_OF_YEAR) || !temporalAccessor.d(a.MONTH_OF_YEAR) || !temporalAccessor.d(a.YEAR)) {
                    return false;
                }
                r rVar = j.a;
                return j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d);
            }

            @Override // j$.time.temporal.r
            public final v H(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: DayOfQuarter");
                }
                long jF = temporalAccessor.f(h.QUARTER_OF_YEAR);
                if (jF == 1) {
                    long jF2 = temporalAccessor.f(a.YEAR);
                    j$.time.chrono.s.d.getClass();
                    return j$.time.chrono.s.W(jF2) ? v.j(1L, 91L) : v.j(1L, 90L);
                }
                if (jF == 2) {
                    return v.j(1L, 91L);
                }
                if (jF == 3 || jF == 4) {
                    return v.j(1L, 92L);
                }
                return A();
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: DayOfQuarter");
                }
                int iJ = temporalAccessor.j(a.DAY_OF_YEAR);
                int iJ2 = temporalAccessor.j(a.MONTH_OF_YEAR);
                long jF = temporalAccessor.f(a.YEAR);
                int[] iArr = h.a;
                int i = (iJ2 - 1) / 3;
                j$.time.chrono.s.d.getClass();
                return iJ - iArr[i + (j$.time.chrono.s.W(jF) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                A().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.e((j - jR) + mVar.f(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor Q(HashMap map, TemporalAccessor temporalAccessor, w wVar) {
                long jSubtractExact;
                LocalDate localDateG0;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                r rVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(rVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iW = aVar.W(l.longValue());
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                r rVar2 = j.a;
                if (!j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (wVar == w.LENIENT) {
                    localDateG0 = LocalDate.of(iW, 1, 1).g0(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iW, ((rVar.A().a(l2.longValue(), rVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (wVar == w.STRICT) {
                            H(localDateOf).b(jLongValue, this);
                        } else {
                            A().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDateG0 = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(rVar);
                return localDateG0.f0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final v A() {
                return v.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean T(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.MONTH_OF_YEAR)) {
                    return false;
                }
                r rVar = j.a;
                return j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.f(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final v H(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: QuarterOfYear");
                }
                return A();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                A().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.e(((j - jR) * 3) + mVar.f(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final v A() {
                return v.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean T(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                r rVar = j.a;
                return j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d);
            }

            @Override // j$.time.temporal.r
            public final v H(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.a0(LocalDate.H(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.X(LocalDate.H(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                A().b(j, this);
                return mVar.i(Math.subtractExact(j, r(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor Q(HashMap map, TemporalAccessor temporalAccessor, w wVar) {
                LocalDate localDateE;
                long j;
                long j2;
                r rVar = h.WEEK_BASED_YEAR;
                Long l = (Long) map.get(rVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = rVar.A().a(l.longValue(), rVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                r rVar2 = j.a;
                if (j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d)) {
                    LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                    if (wVar == w.LENIENT) {
                        long jLongValue2 = l2.longValue();
                        if (jLongValue2 > 7) {
                            long j3 = jLongValue2 - 1;
                            j = 1;
                            localDateOf = localDateOf.h0(j3 / 7);
                            j2 = j3 % 7;
                        } else {
                            j = 1;
                            if (jLongValue2 < 1) {
                                localDateOf = localDateOf.h0(Math.subtractExact(jLongValue2, 7L) / 7);
                                j2 = (jLongValue2 + 6) % 7;
                            }
                            localDateE = localDateOf.h0(Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                        }
                        jLongValue2 = j2 + j;
                        localDateE = localDateOf.h0(Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                    } else {
                        int iW = aVar.W(l2.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (wVar == w.STRICT) {
                                h.a0(localDateOf).b(jLongValue, this);
                            } else {
                                A().b(jLongValue, this);
                            }
                        }
                        localDateE = localDateOf.h0(jLongValue - 1).e(iW, aVar);
                    }
                    map.remove(this);
                    map.remove(rVar);
                    map.remove(aVar);
                    return localDateE;
                }
                throw new DateTimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final v A() {
                return a.YEAR.A();
            }

            @Override // j$.time.temporal.r
            public final boolean T(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                r rVar = j.a;
                return j$.time.chrono.l.D(temporalAccessor).equals(j$.time.chrono.s.d);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: WeekBasedYear");
                }
                return h.b0(LocalDate.H(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final v H(TemporalAccessor temporalAccessor) {
                if (!T(temporalAccessor)) {
                    throw new u("Unsupported field: WeekBasedYear");
                }
                return A();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j) {
                if (!T(mVar)) {
                    throw new u("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.A().a(j, h.WEEK_BASED_YEAR);
                LocalDate localDateH = LocalDate.H(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iJ = localDateH.j(aVar);
                int iX = h.X(localDateH);
                if (iX == 53 && h.c0(iA) == 52) {
                    iX = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return mVar.m(localDateOf.f0(((iX - 1) * 7) + (iJ - localDateOf.j(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static v a0(LocalDate localDate) {
        return v.j(1L, c0(b0(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c0(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.Y()) ? 53 : 52;
        }
        return 53;
    }

    static int X(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iR = localDate.R() - 1;
        int i = (3 - iOrdinal) + iR;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iR < i3) {
            return (int) v.j(1L, c0(b0(localDate.m0(180).i0(-1L)))).d();
        }
        int i4 = ((iR - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.Y())) {
            return i4;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b0(LocalDate localDate) {
        int iW = localDate.W();
        int iR = localDate.R();
        if (iR <= 3) {
            return iR - localDate.getDayOfWeek().ordinal() < -2 ? iW - 1 : iW;
        }
        if (iR >= 363) {
            return ((iR - 363) - (localDate.Y() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? iW + 1 : iW;
        }
        return iW;
    }
}
