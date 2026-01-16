import GHC.Base (VecElem(Int16ElemRep))
-- doble :: Integer -> Integer
-- doble x = x * x
--
-- main :: IO ()
-- main = do
--   putStrLn "Escribe un numero para elevarlo a su cuadrado: "
--   entrada <- getLine
--   let resultado = read entrada :: Integer
--   print (" El resultado es: " ++ show (doble resultado))

-- area :: Integer -> Integer -> Integer
-- area a b = a * b
--
-- main :: IO ()
-- main = do
--   putStrLn "base: "
--   bs <- getLine 
--   putStrLn  "alturs"
--   alt <- getLine 
--   let kirb = read bs :: Integer
--   let kirba = read alt :: Integer
--   print (" el area es: " ++ show (area kirb kirba))

-- esPar :: Integer -> Bool
-- esPar a = if a `mod` 2 == 0
--           then True
--           else False
--
-- main :: IO ()
-- main = do
--   putStrLn "Dame un numero klio "
--   num <- getLine
--   let number = read num :: Integer
--   if esPar number
--     then putStrLn (show number ++ " es par. ")
--     else putStrLn (show number ++ " es impar. ")

-- fahrenheitACelsius :: Float -> Float
-- fahrenheitACelsius fahrenheit = (fahrenheit - 32) * 5 / 9
--
-- main :: IO ()
-- main = do
--   putStrLn "Ingresa la temperatura en Fahrenheit: "
--   entrada <- getLine
--   let fahr = read entrada :: Float
--   let celsius = fahrenheitACelsius fahr
--   putStrLn ("La temperatura en Celsius es: " ++ show celsius)

-- primerElemento :: [a] -> a
-- primerElemento lista = head lista
--
-- main :: IO ()
-- main = do
--   let miLista = [10, 20, 30, 40, 50]
--   let primero = primerElemento miLista
--   print ("El primer elemento es: " ++ show primero)

-- ultimoElemento :: [a] -> a
-- ultimoElemento lista = last lista
--
-- main :: IO ()
-- main = do
--   let miLista = [10,20,30,40,50]
--   let ultimo = ultimoElemento miLista 
--   print ("El ultimo elemento de mis lista es: " ++ show ultimo)

-- sumarLista :: Num a => [a] -> a
-- sumarLista lista = sum lista
--
-- main :: IO ()
-- main = do
--   let milista = [10,20,30,40,50]
--   print ("La suma de la lista es: " ++ show (sumarLista milista))

-- longitudes :: [String] -> [Int]
-- longitudes cadenas = map length cadenas
--
-- main :: IO ()
-- main = do
--   let miLista = ["hola", "mundo", "Haskell", "es", "genial"]
--   let largos = longitudes miLista
--   print ("Las longitudes son: " ++ show largos)

filtrarCadenasLargas :: [String] -> Int -> [String]
filtrarCadenasLargas cadenas n = filter (\cadenas -> length cadenas > n) cadenas

main :: IO ()
main = do 
  putStrLn "Escribe un numero: "
  num <- getLine
  let number = read num :: Int
  let miLista = ["hola", "mundo", "Haskell", "es", "genial"]
  let largos = filtrarCadenasLargas miLista number
  print ("Las longitudes son: " ++ show largos)


