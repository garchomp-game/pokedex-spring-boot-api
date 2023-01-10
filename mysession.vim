let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/workspace/pokemon_community_app/myapp
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +22 src/main/java/com/example/myapp/controller/PokedexController.java
badd +1 .
badd +1704 src/main/resources/pokedex/pokedex/pokedex.json
badd +1 src/main/java/com/example/myapp/factory/JsonPropertySourceFactory.java
badd +7 src/main/java/com/example/myapp/property/PokemonNameList.java
badd +18 src/main/java/com/example/myapp/property/MegaEvolution.java
badd +7 src/main/java/com/example/myapp/property/MegaEvolutionName.java
badd +15 src/main/java/com/example/myapp/property/Pokedex.java
badd +15 src/main/java/com/example/myapp/property/PokedexBase.java
badd +9 src/main/java/com/example/myapp/property/GigaEvolution.java
badd +7 src/main/java/com/example/myapp/property/GigaEvolutionName.java
badd +10 src/main/java/com/example/myapp/interface/PropertyInterface.java
argglobal
%argdel
set lines=49 columns=191
edit src/main/java/com/example/myapp/property/MegaEvolution.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd _ | wincmd |
split
1wincmd k
wincmd w
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe '1resize ' . ((&lines * 22 + 24) / 49)
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe '2resize ' . ((&lines * 23 + 24) / 49)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 3resize ' . ((&columns * 95 + 95) / 191)
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 18 - ((17 * winheight(0) + 11) / 22)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 18
normal! 0
wincmd w
argglobal
if bufexists(fnamemodify("src/main/java/com/example/myapp/interface/PropertyInterface.java", ":p")) | buffer src/main/java/com/example/myapp/interface/PropertyInterface.java | else | edit src/main/java/com/example/myapp/interface/PropertyInterface.java | endif
if &buftype ==# 'terminal'
  silent file src/main/java/com/example/myapp/interface/PropertyInterface.java
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 10 - ((9 * winheight(0) + 11) / 23)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 10
normal! 028|
wincmd w
argglobal
if bufexists(fnamemodify("src/main/resources/pokedex/pokedex/pokedex.json", ":p")) | buffer src/main/resources/pokedex/pokedex/pokedex.json | else | edit src/main/resources/pokedex/pokedex/pokedex.json | endif
if &buftype ==# 'terminal'
  silent file src/main/resources/pokedex/pokedex/pokedex.json
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 1704 - ((22 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 1704
normal! 08|
wincmd w
2wincmd w
exe '1resize ' . ((&lines * 22 + 24) / 49)
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe '2resize ' . ((&lines * 23 + 24) / 49)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 3resize ' . ((&columns * 95 + 95) / 191)
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let &winminheight = s:save_winminheight
let &winminwidth = s:save_winminwidth
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
