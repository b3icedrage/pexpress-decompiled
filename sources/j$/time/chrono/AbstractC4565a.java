package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4565a implements l {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((l) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static l A(AbstractC4565a abstractC4565a, String str) {
        String strP;
        l lVar = (l) a.putIfAbsent(str, abstractC4565a);
        if (lVar == null && (strP = abstractC4565a.P()) != null) {
            b.putIfAbsent(strP, abstractC4565a);
        }
        return lVar;
    }

    static l r(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            l lVar = (l) concurrentHashMap.get(str);
            if (lVar == null) {
                lVar = (l) b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.getId()) || str.equals(lVar2.P())) {
                        return lVar2;
                    }
                }
                throw new DateTimeException("Unknown chronology: ".concat(str));
            }
            o oVar = o.m;
            A(oVar, oVar.getId());
            v vVar = v.d;
            A(vVar, vVar.getId());
            A a2 = A.d;
            A(a2, a2.getId());
            G g = G.d;
            A(g, g.getId());
            try {
                for (AbstractC4565a abstractC4565a : Arrays.asList(new AbstractC4565a[0])) {
                    if (!abstractC4565a.getId().equals("ISO")) {
                        A(abstractC4565a, abstractC4565a.getId());
                    }
                }
                s sVar = s.d;
                A(sVar, sVar.getId());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC4565a() {
    }

    @Override // j$.time.chrono.l
    public ChronoLocalDate N(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return q(((Long) map.remove(aVar)).longValue());
        }
        Q(map, wVar);
        ChronoLocalDate chronoLocalDateT = T(map, wVar);
        if (chronoLocalDateT != null) {
            return chronoLocalDateT;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return R(map, wVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return E(iA, 1, 1).i(jSubtractExact, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).i(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).i(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = S(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate chronoLocalDateI = E(iA, iA2, 1).i((S(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((S(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
                    if (wVar != j$.time.format.w.STRICT || chronoLocalDateI.j(aVar3) == iA2) {
                        return chronoLocalDateI;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (wVar == j$.time.format.w.LENIENT) {
                        return H(E(iA3, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = S(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate chronoLocalDateM = E(iA3, iA4, 1).i((S(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(DayOfWeek.r(S(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).p(), 0));
                    if (wVar != j$.time.format.w.STRICT || chronoLocalDateM.j(aVar3) == iA4) {
                        return chronoLocalDateM;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (wVar != j$.time.format.w.LENIENT) {
                return y(iA5, S(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return y(iA5, 1).i(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (wVar == j$.time.format.w.LENIENT) {
                return y(iA6, 1).i(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.WEEKS).i(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            }
            ChronoLocalDate chronoLocalDateI2 = y(iA6, 1).i((S(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((S(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
            if (wVar != j$.time.format.w.STRICT || chronoLocalDateI2.j(aVar2) == iA6) {
                return chronoLocalDateI2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (wVar == j$.time.format.w.LENIENT) {
            return H(y(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        ChronoLocalDate chronoLocalDateM2 = y(iA7, 1).i((S(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.t) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(DayOfWeek.r(S(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).p(), 0));
        if (wVar != j$.time.format.w.STRICT || chronoLocalDateM2.j(aVar2) == iA7) {
            return chronoLocalDateM2;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    void Q(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (wVar != j$.time.format.w.LENIENT) {
                aVar.X(l.longValue());
            }
            ChronoLocalDate chronoLocalDateE = J().e(1L, (j$.time.temporal.r) j$.time.temporal.a.DAY_OF_MONTH).e(l.longValue(), (j$.time.temporal.r) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            p(map, aVar2, chronoLocalDateE.j(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            p(map, aVar3, chronoLocalDateE.j(aVar3));
        }
    }

    ChronoLocalDate T(Map map, j$.time.format.w wVar) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l2 = (Long) map.remove(aVar2);
            if (wVar != j$.time.format.w.LENIENT) {
                intExact = S(aVar).a(l.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                p(map, j$.time.temporal.a.YEAR, u(L(S(aVar2).a(l2.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                p(map, aVar3, u(y(S(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).t(), intExact));
                return null;
            }
            if (wVar == j$.time.format.w.STRICT) {
                map.put(aVar, l);
                return null;
            }
            List listB = B();
            if (listB.isEmpty()) {
                p(map, aVar3, intExact);
                return null;
            }
            p(map, aVar3, u((m) listB.get(listB.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        S(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    ChronoLocalDate R(Map map, j$.time.format.w wVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = S(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (wVar == j$.time.format.w.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return E(iA, 1, 1).i(jSubtractExact, (j$.time.temporal.t) j$.time.temporal.b.MONTHS).i(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.t) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = S(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = S(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (wVar != j$.time.format.w.SMART) {
            return E(iA, iA2, iA3);
        }
        try {
            return E(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return E(iA, iA2, 1).m(new j$.time.temporal.p(0));
        }
    }

    static ChronoLocalDate H(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateI = chronoLocalDate.i(j, (j$.time.temporal.t) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        ChronoLocalDate chronoLocalDateI2 = chronoLocalDateI.i(j2, (j$.time.temporal.t) bVar);
        if (j3 > 7) {
            long j5 = j3 - 1;
            chronoLocalDateI2 = chronoLocalDateI2.i(j5 / 7, (j$.time.temporal.t) bVar);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                chronoLocalDateI2 = chronoLocalDateI2.i(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.t) bVar);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateI2.m(new j$.time.temporal.o(DayOfWeek.r((int) j3).p(), 0));
        }
        j3 = j4 + 1;
        return chronoLocalDateI2.m(new j$.time.temporal.o(DayOfWeek.r((int) j3).p(), 0));
    }

    static void p(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l != null && l.longValue() != j) {
            throw new DateTimeException("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC4565a) && getId().compareTo(((AbstractC4565a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return getId();
    }
}
